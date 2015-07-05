package cg.base.util;

import java.io.File;

/**
 * 监听文件修改的接口。
 * @author lighthu
 */
public interface IFileModificationListener {
	
	/**
	 * 文件修改
	 * @param 	f
	 * 			文件
	 */
    void fileModified(File f);
    
}
