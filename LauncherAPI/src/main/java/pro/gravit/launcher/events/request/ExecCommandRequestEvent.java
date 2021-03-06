package pro.gravit.launcher.events.request;

import pro.gravit.launcher.LauncherNetworkAPI;
import pro.gravit.launcher.events.RequestEvent;

public class ExecCommandRequestEvent extends RequestEvent {
    @LauncherNetworkAPI
    public final boolean success;

    public ExecCommandRequestEvent(boolean success) {
        this.success = success;
    }

    @Override
    public String getType() {
        return "cmdExec";
    }
}
