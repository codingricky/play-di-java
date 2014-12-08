package services;

import com.google.inject.ImplementedBy;

@ImplementedBy(RealGreetingService.class)
public interface GreetingService {
  public String greeting();
}
