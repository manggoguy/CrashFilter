package plugin.java.com.plas.crashfilter.analysis.memory.mloc;

import plugin.java.com.plas.crashfilter.analysis.memory.IValue;

public class Symbol_Top implements IValue{
	//Top Symbol. 
private static Symbol_Top ST =null;
	private Symbol_Top(){}
	public static Symbol_Top getSymbolTop()
	{
		if (ST == null)
		{
			ST = new Symbol_Top();
			return ST;
		}
		else
		{
			return ST;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Top]";
	}
}
