package cg.base.script.gmsv;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import cg.base.script.GMSVCompiledScript;
import net.io.IMessageSender;

public abstract class OpenItemCountWindow extends GMSVCompiledScript {

	protected OpenItemCountWindow(ScriptEngine scriptEngine) {
		super(scriptEngine);
	}

	@Override
	public Object eval(ScriptContext context) throws ScriptException {
		Bindings bindings = context.getBindings(ScriptContext.GLOBAL_SCOPE);
		IMessageSender sender = (IMessageSender) bindings.get("player");
		String message = (String) bindings.get("param");
		if (sender == null || message == null) {
			return null;
		} else {
			String[] infos = message.split(",");
			if (infos.length == 0) {
				return null;
			} else {
				String[] messages = new String[infos.length];
				for (int i = 0;i < infos.length;i++) {
					messages[i] = getMessage(context, Integer.parseInt(infos[i]));
				}
				return messages;
			}
		}
	}
	
	protected abstract String getMessage(ScriptContext context, int id);

}
