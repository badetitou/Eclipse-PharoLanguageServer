package fr.badetitou.javalanguageserver;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.lsp4e.server.ProcessStreamConnectionProvider;

public class StreamConnectionProvider extends ProcessStreamConnectionProvider
		implements org.eclipse.lsp4e.server.StreamConnectionProvider {

	public StreamConnectionProvider () { 

        List<String> commands = new ArrayList<>();
        commands.add("D:\\Users\\benoit.verhaeghe\\Documents\\Pharo\\vms\\100-x64\\Pharo.exe");
        commands.add("D:\\Users\\benoit.verhaeghe\\Documents\\Pharo\\images\\LanguageServer\\LanguageServer.image");
        commands.add("st");
        commands.add("C:\\Users\\benoit.verhaeghe\\eclipse-LSP-workspace\\fr.badetitou.javalanguageserver\\res\\run-server.st");
        setCommands(commands);
	}
	
}
