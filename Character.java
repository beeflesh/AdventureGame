import java.util.*;

public class Character extends GameObject {

  private Location location;
  private List<Item> inventory;
  private DialogNode script;

  public Character (String name) {
    super(name, "");
  }

  public Character (String name, Location location) {
    super(name, "");
    this.location = location;
    this.inventory = new ArrayList<>();
  }

  public Character (String name, Location location, List<Item> inventory) {
    super(name, "");

  }

  public void setScript (DialogNode script) {
    this.script = script;
  }

  // TODO: interact method for NPCs
  public void interact () {

  }

  public void setCurrentLocation (Location location) {
    this.location = location;
  }

  public Location getCurrentLocation () {
    return location;
  }

  public void printStuff () {
    for (Item thing : inventory) {
      System.out.println(thing);
    }
  }
}