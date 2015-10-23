package cg.base.script.gmsv;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import cg.base.script.GMSVCompiledScript;

public abstract class CountItemNum extends GMSVCompiledScript {

	private static final String ITEM_OBJECT_KEY = "item";
	
	protected CountItemNum(ScriptEngine scriptEngine) {
		super(scriptEngine);
	}

	@Override
	public Object eval(ScriptContext context) throws ScriptException {
		Bindings bindings = context.getBindings(ScriptContext.GLOBAL_SCOPE);
		Object itemObject = bindings.get(ITEM_OBJECT_KEY);
		if (itemObject == null) {
			return null;
		} else {
			String[] itemInfos = itemObject.toString().split(",");
			if (itemInfos.length == 0) {
				int[] ret = new int[itemInfos.length];
				for (int i = 0;i < itemInfos.length;i++) {
					int itemId = Integer.parseInt(itemInfos[i].trim());
					ret[i] = getItemNum(itemId, context);
				}
				return ret;
			} else {
				return null;
			}
		}
	}
	
	protected abstract int getItemNum(int itemId, ScriptContext context);

}
