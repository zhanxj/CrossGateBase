package cg.base.script;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import cg.base.log.Log;

public class CCompiledScript extends CompiledScript implements Compilable {
	
	private final Log log;
	
	private final ScriptEngine scriptEngine;
	
	public CCompiledScript(ScriptEngine scriptEngine, Log log) {
		this.scriptEngine = scriptEngine;
		this.log = log;
	}

	@Override
	public Object eval(ScriptContext context) throws ScriptException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScriptEngine getEngine() {
		return scriptEngine;
	}

	@Override
	public CompiledScript compile(String script) throws ScriptException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompiledScript compile(Reader script) throws ScriptException {
		BufferedReader in = new BufferedReader(script);
		String line;
		try {
	        while ((line = in.readLine()) != null) {
	        	
	        }
		} catch (IOException e) {
			log.error("", e);
		}
		return null;
	}

}
