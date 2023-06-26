package com.xware.XTJavaApp;

/**
 * xT Java Application!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        CmdLnOptions options = new CmdLnOptions(args);
        
        String infile = options.getInfile();
        String outfile = options.getOutfile();
        String contract = options.getContract();
        String config = options.getConf();
        String action = options.getAction();
        
        
    }
}
