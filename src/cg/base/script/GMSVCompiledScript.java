package cg.base.script;

import javax.script.CompiledScript;
import javax.script.ScriptEngine;

public abstract class GMSVCompiledScript extends CompiledScript {
	
	private final ScriptEngine scriptEngine;
	
	protected GMSVCompiledScript(ScriptEngine scriptEngine) {
		this.scriptEngine = scriptEngine;
	}

	@Override
	public ScriptEngine getEngine() {
		return scriptEngine;
	}

}
