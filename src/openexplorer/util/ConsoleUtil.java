/*package openexplorer.util;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

*//**
 * 
 * @author Leequn
 * @date 2018年12月3日
 *
 *//*
public class ConsoleUtil {
	
	public static MessageConsole console = null;
	public static MessageConsoleStream consoleStream = null;
	public static IConsoleManager consoleManager = null;
	final static String CONSOLE_NAME = "Console";

	public static  void initConsole() {
		// 新建一个MessageConsole，可以自定义Console的名称
		console = new MessageConsole(CONSOLE_NAME, null);

		// 通过ConsolePlugin得到IConsoleManager，添加自定义的MessageConsole
		consoleManager = ConsolePlugin.getDefault().getConsoleManager();
		consoleManager.addConsoles(new IConsole[] { console });

		// 新建一个MessageConsoleStream， 作用是接收需要打印的消息
		consoleStream = console.newMessageStream();
	}
}
*/