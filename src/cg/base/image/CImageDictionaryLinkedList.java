package cg.base.image;

import java.util.List;

import cg.base.CrossGateBase;

import com.google.common.collect.Lists;

/**
 * 
 * {@link #get(int)} �����ڴ�й¶
 * @author 	Huiyuan.Fu
 */
@Deprecated
public class CImageDictionaryLinkedList {
	
	private Entry head, tail, last, versionHeads[], versionTails[], versionLasts[];
	
	private int count;
	
	private List<Integer> nullImageId;
	
	public CImageDictionaryLinkedList(int size) {
		versionHeads = new Entry[size];
		versionTails = new Entry[size];
		versionLasts = new Entry[size];
		nullImageId = Lists.newArrayList();
	}
	
	public void add(ImageDictionary object) {
//		remove(object.getGlobalId());
		
		Entry entry = new Entry();
		entry.object = object;
		
		boolean isNewVersion = head == null ? true : tail.object.getVersion() != object.getVersion();
		if (head == null) {
			head = entry;
			tail = head;
			last = head;
		} else {
			tail.next = entry;
			entry.previous = tail;
			tail = entry;
		}
		
		refreshHeadAndTail();
		count++;
		
		if (isNewVersion) {
			versionHeads[object.getVersion()] = tail;
			versionLasts[object.getVersion()] = tail;
			if (object.getVersion() > 0) {
				versionTails[object.getVersion() - 1] = tail.previous;
			}
		} else {
			versionTails[object.getVersion()] = tail.previous;
		}
	}
	
	private void refreshHeadAndTail() {
		head.previous = tail;
		tail.next = head;
	}
	
	private Entry getEntry(int imageGlobalId) {
		if (imageGlobalId == 0 || nullImageId.contains(new Integer(imageGlobalId))) {
			return null;
		}
		Entry headFinder = head;
		Entry tailFinder = tail;
		Entry lastHeadFinder = last;
		Entry lastTailFinder = last;
		for (int i = 0;i < getSize();i++) {
			if (headFinder.object.getGlobalId() == imageGlobalId) {
				last = headFinder;
				return headFinder;
			} else if (tailFinder.object.getGlobalId() == imageGlobalId) {
				last = tailFinder;
				return tailFinder;
			} else if (lastHeadFinder.object.getGlobalId() == imageGlobalId) {
				last = lastHeadFinder;
				return lastHeadFinder;
			} else if (lastTailFinder.object.getGlobalId() == imageGlobalId) {
				last = lastTailFinder;
				return lastTailFinder;
			} else if (headFinder.equals(lastTailFinder) && tailFinder.equals(lastHeadFinder)) {
				break;
			} else {
				headFinder = headFinder.next;
				tailFinder = tailFinder.previous;
				lastHeadFinder = lastHeadFinder.next;
				lastTailFinder = lastTailFinder.previous;
			}
		}
		nullImageId.add(imageGlobalId);
//		CrossGateData.log.warning(getClass() + ".get() return null. imageGlobalId = " + imageGlobalId);
		return null;
	}
	
	public ImageDictionary get(int imageGlobalId) {
		Entry entry = getEntry(imageGlobalId);
		return entry == null ? null : entry.object;
//		if (imageGlobalId == 0 || nullImageId.contains(new Integer(imageGlobalId))) {
//			return null;
//		}
//		Entry headFinder = head;
//		Entry tailFinder = tail;
//		Entry lastHeadFinder = last;
//		Entry lastTailFinder = last;
//		for (int i = 0;i < getSize();i++) {
//			if (headFinder.object.getGlobalId() == imageGlobalId) {
//				last = headFinder;
//				return headFinder.object;
//			} else if (tailFinder.object.getGlobalId() == imageGlobalId) {
//				last = tailFinder;
//				return tailFinder.object;
//			} else if (lastHeadFinder.object.getGlobalId() == imageGlobalId) {
//				last = lastHeadFinder;
//				return lastHeadFinder.object;
//			} else if (lastTailFinder.object.getGlobalId() == imageGlobalId) {
//				last = lastTailFinder;
//				return lastTailFinder.object;
//			} else if (headFinder.equals(lastTailFinder) && tailFinder.equals(lastHeadFinder)) {
//				break;
//			} else {
//				headFinder = headFinder.next;
//				tailFinder = tailFinder.previous;
//				lastHeadFinder = lastHeadFinder.next;
//				lastTailFinder = lastTailFinder.previous;
//			}
//		}
//		nullImageId.add(imageGlobalId);
////		CrossGateData.log.warning(getClass() + ".get() return null. imageGlobalId = " + imageGlobalId);
//		return null;
	}
	
	public ImageDictionary get(byte version, int imageId) {
		if (version >= versionHeads.length) {
			return null;
		}
		Entry headFinder = versionHeads[version];
		Entry tailFinder = versionTails[version];
		Entry lastHeadFinder = versionLasts[version];
		Entry lastTailFinder = versionLasts[version];
//		int count = 0;
		for (int i = 0;i < getSize();i++) {
			if (headFinder.object.getResourceId() == imageId && headFinder.object.getVersion() == version) {
				versionLasts[version] = headFinder;
//				CrossGateData.log.info(getClass() + ".get() : count = " + count + " ; version = " + version + " ; imageId = " + imageId);
				return headFinder.object;
			} else if (tailFinder.object.getResourceId() == imageId && tailFinder.object.getVersion() == version) {
				versionLasts[version] = tailFinder;
//				CrossGateData.log.info(getClass() + ".get() : count = " + count + " ; version = " + version + " ; imageId = " + imageId);
				return tailFinder.object;
			} else if (lastHeadFinder.object.getResourceId() == imageId && lastHeadFinder.object.getVersion() == version) {
				versionLasts[version] = lastHeadFinder;
//				CrossGateData.log.info(getClass() + ".get() : count = " + count + " ; version = " + version + " ; imageId = " + imageId);
				return lastHeadFinder.object;
			} else if (lastTailFinder.object.getResourceId() == imageId && lastTailFinder.object.getVersion() == version) {
				versionLasts[version] = lastTailFinder;
//				CrossGateData.log.info(getClass() + ".get() : count = " + count + " ; version = " + version + " ; imageId = " + imageId);
				return lastTailFinder.object;
			} else if (headFinder.equals(lastTailFinder) && tailFinder.equals(lastHeadFinder)) {
				break;
			} else {
				headFinder = headFinder.next;
				tailFinder = tailFinder.previous;
				lastHeadFinder = lastHeadFinder.next;
				lastTailFinder = lastTailFinder.previous;
			}
//			count++;
		}
		return null;
	}
	
	public int getSize() {
		return count;
	}
	
	protected void remove(int imageGlobalId) {
		Entry entry = getEntry(imageGlobalId);
		if (entry != null) {
			entry.previous.next = entry.next;
			entry.next.previous = entry.previous;
			CrossGateBase.getLog().warning(getClass() + "::remove(" + entry.object + ") : old image.");
		}
	}
	
	private static final class Entry {
		
		private ImageDictionary object;
		
		private Entry next, previous;
		
	}

}
