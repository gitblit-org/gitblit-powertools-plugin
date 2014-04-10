package com.gitblit.plugin.powertools;

import com.gitblit.manager.IGitblit;
import com.gitblit.transport.ssh.commands.CommandMetaData;
import com.gitblit.transport.ssh.commands.SshCommand;

@CommandMetaData(name = "reset", description = "Reset Gitblit's internal caches", admin = true)
public class ResetCommand extends SshCommand {

	@Override
	public void run() throws UnloggedFailure {
		IGitblit gitblit = getContext().getGitblit();
		gitblit.resetRepositoryListCache();
		gitblit.getTicketService().resetCaches();
	}
}