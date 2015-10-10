package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoAttributes {

	private VO_ATTRIBUTES vo;

	private VO_ATTRIBUTES.Builder builder;

	public VoAttributes(VO_ATTRIBUTES vo) {
		this.vo = vo;
	}

	public VoAttributes() {
		builder = VO_ATTRIBUTES.newBuilder();
	}

	/**
	 * 
	 * @param	attributes
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAttributes(Iterable<VoAttribute> attributes) {
		List<VO_ATTRIBUTE> list = Lists.newLinkedList();
		for (VoAttribute vo : attributes) {
			list.add(vo.getVO_ATTRIBUTE());
		}
		builder.addAllAttributes(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoAttribute> getAttributesList() {
		List<VO_ATTRIBUTE> list = vo.getAttributesList();
		List<VoAttribute> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_ATTRIBUTE vo : list) {
			ret.add(new VoAttribute(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	type
	 * 			<u>do not has any annotate.</u>
	 */
	public void setType(String type) {
		builder.setType(type);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getType() {
		String ret = vo.getType();		return ret;
	}

	public VO_ATTRIBUTES getVO_ATTRIBUTES() {
		return vo == null ? builder.build() : vo;
	}

}
