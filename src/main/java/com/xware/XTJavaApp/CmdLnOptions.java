package com.xware.XTJavaApp;

public class CmdLnOptions {
	
	private String infile;
	private String outfile;
	private String conf;
	private String contract;
	private String action;

	public CmdLnOptions (String[] args) {
		parseArgs(args);
	}
	
	private void parseArgs(String[] args) {
		for (int i = 0; i < args.length; i++ ) {
			String arg = args[i];
			if (arg.equals("-infile") && i < args.length - 1 ) {
				infile = args[i + 1];
				i++;
			}
			if (arg.equals("-outfile") && i < args.length - 1 ) {
				outfile = args[i + 1];
				i++;
			}
			if (arg.equals("-conf") && i < args.length - 1) {
				conf = args[i + 1];
				i++;
			}
			if (arg.equals("-contract") && i < args.length -1) {
				contract = args[i + 1];
				i++;
			}
			if (arg.equals("-action") && i < args.length -1) {
				action = args[i + 1];
				i++;
			}
		}
	}

	public String getInfile() {
		return infile;
	}

	public String getOutfile() {
		return outfile;
	}

	public String getConf() {
		return conf;
	}

	public String getContract() {
		return contract;
	}

	public String getAction() {
		return action;
	}

}
