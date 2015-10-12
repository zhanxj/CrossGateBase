package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoPetSet {

	private VO_PET_SET vo;

	private VO_PET_SET.Builder builder;

	public VoPetSet(VO_PET_SET vo) {
		this.vo = vo;
	}

	public VoPetSet() {
		builder = VO_PET_SET.newBuilder();
	}

	/**
	 * 
	 * @param	pets
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPets(Iterable<VoPet> pets) {
		List<VO_PET> list = Lists.newLinkedList();
		for (VoPet vo : pets) {
			list.add(vo.getVO_PET());
		}
		builder.addAllPets(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoPet> getPetsList() {
		List<VO_PET> list = vo.getPetsList();
		List<VoPet> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_PET vo : list) {
			ret.add(new VoPet(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	max
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMax(Integer max) {
		builder.setMax(max);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMax() {
		int ret = vo.getMax();
		return ret;
	}

	public VO_PET_SET getVO_PET_SET() {
		return vo == null ? builder.build() : vo;
	}

}
