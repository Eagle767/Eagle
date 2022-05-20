package Access;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StringDemos {
	static Logger logger=Logger.getLogger(StringDemos.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		//System.out.println(PropertyConfigurator.configure(log4jConfigFile));
		logger.info(log4jConfigFile);
		logger.info("log4j.Properties");
		logger.info(System.getProperty("user.dir"));
		//int u=10;
		Integer t=Integer.valueOf(20);
		logger.info(t);
		String a="Hello",b="Muthu",c="Hi";
		boolean s=b.equals(a);
		logger.info(s);
		logger.info(String.valueOf(b.equals(c)));//equal to true or false
		logger.info(b.equals(a));
		
		char d=a.charAt(4);//Location to get Character
		logger.info(d);  
		logger.info(b.charAt(0));
		
		b.chars();
		logger.info(b.chars());
		
		int e=b.codePointAt(4);
		logger.info(c.codePointAt(1));// get Character ascii value
		logger.info(e);
		
		int f=a.codePointBefore(1);
		logger.info(f);
		logger.info(b.codePointBefore(3));//1,2,3,4 to check value provide ascii value-1
		
		//b.valueOf(b[2], 1, 1);
		//logger.warn(b.valueOf(b[2], 1, 1));
		
		String g=b.valueOf("HI HI");
		logger.info(g);
		logger.info(b);
		
		String h=b.concat(c);
		logger.info(h);
		logger.info(a.concat(h));
		
		b.charAt(2);
		logger.info(b.charAt(2));
		b.chars();
		logger.info(b.chars());
		b.codePointAt(2);
		logger.info(b.codePointAt(2));
		b.codePointBefore(2);
		logger.info(b.codePointBefore(2));
		b.codePointCount(1, 2);
		logger.info(b.codePointCount(1, 4));
		b.codePoints();
		logger.info(b.codePoints());
		b.compareTo(h);
		logger.info(b.compareTo(h));
		b.compareToIgnoreCase(h);
		logger.info(b.compareToIgnoreCase(h));
		b.concat(h);
		logger.info(b.concat(h));
		b.contains(h);
		logger.info(b.contains(h));
		logger.info(h.contains(h));
		b.contentEquals(c);
		logger.info(b.contentEquals(a));
		b.contentEquals("");
		logger.info(b.contentEquals("Muthu"));
		b.describeConstable();
		logger.info(b.describeConstable());
		b.endsWith(h);
		logger.info(b.endsWith(h));
		b.equals(c);
		logger.info(b.equals(c));
		b.equalsIgnoreCase(h);
		logger.info(b.equalsIgnoreCase(h));
		b.formatted(args);
		logger.info(b.formatted(args));
		b.getBytes();
		logger.info(b.getBytes());
		//b.getBytes(null);
		//b.getBytes(h);
		//b.getChars(e, d, null, e);
		//logger.info(b.getChars(a, c,null , b));
		b.getClass();
		logger.info(b.getClass());
		b.hashCode();
		logger.info(b.hashCode());
		b.indent(f);
		logger.info(b.indent(f));
		b.indexOf(f);
		logger.info(b.indexOf(f));
		b.indexOf(h);
		logger.info(b.indexOf(h));
		b.indexOf(e, f);
		logger.info(b.indexOf(e, f));
		b.lastIndexOf(h, f);
		logger.info(b.lastIndexOf(h, f));
		b.length();
		logger.info(b.length());
		b.lines();
		logger.info(b.lines());
		b.matches(g);
		logger.info(b.matches(g));
		//b.notify();
		//logger.info(b.notify());
		//b.notifyAll();
		//logger.info(b.notifyAll());
		//b.offsetByCodePoints(e, f);
		//logger.info(b.offsetByCodePoints(e, f));
		b.regionMatches(f, h, f, e);
		logger.info(b.regionMatches(f, h, f, e));
		b.regionMatches(s, f, h, f, e);
		logger.info(b.regionMatches(f, h, f, e));
		b.repeat(f);
		logger.info(b.repeat(f));
		b.replace(d, d);b.replace(g, c);
		logger.info(b.replace(d, d)+b.replace(g, c));
		b.replace(g, c);
		logger.info(b.replace(g, c));
		b.replaceAll(g, c);
		logger.info(b.replaceAll(g, c));
		b.replaceFirst(g, c);
		logger.info(b.replaceFirst(g, c));
		b.resolveConstantDesc(null);
		logger.info(b.resolveConstantDesc(null));
		b.split(g);
		logger.info(b.split(g));
		b.split(g, f);
		logger.info(b.split(g,f));
		b.startsWith(h);
		logger.info(b.startsWith(h));
		b.startsWith(h, f);
		b.strip();
		b.stripIndent();
		b.stripLeading();
		b.stripTrailing();
		b.subSequence(d, e);
		b.substring(e);
		b.substring(d, e);
		b.toCharArray();
		b.toLowerCase();
		b.toLowerCase(null);
		b.toString();
		b.toUpperCase();
		b.toUpperCase(null);
		b.transform(null);
		b.translateEscapes();
		b.trim();
		//b.wait();
		//b.wait(e);
		//b.wait(e, f);
		//b.CASE_INSENSITIVE_ORDER;
		b.copyValueOf(null);
		b.copyValueOf(null, e, f);
		b.format(a, args);
		b.format(null, a, args);
		b.join(h, args);
		//b.join(h, null);
		b.valueOf(null, e, f);
		b.valueOf(b);
		b.valueOf(f);
		b.valueOf(f);
		b.valueOf(f);
		b.valueOf(d);
		b.valueOf(null);
		b.valueOf(d);
		b.valueOf(s);
	}
}
