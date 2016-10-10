package TestWebProject.bean.command;

import TestWebProject.bean.bean.Request;
import TestWebProject.bean.bean.Response;

public interface Command {

    Response execute(Request request);// public abstract
}
