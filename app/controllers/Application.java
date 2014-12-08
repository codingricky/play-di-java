package controllers;

import play.*;
import play.mvc.*;

import services.GreetingService;
import views.html.*;

import javax.inject.Inject;

public class Application extends Controller {

  private final GreetingService greetingService;

  @Inject
  public Application(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public Result index() {
    return ok(index.render(greetingService.greeting()));
  }
}
