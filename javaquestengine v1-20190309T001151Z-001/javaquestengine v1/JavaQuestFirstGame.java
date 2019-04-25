public class JavaQuestFirstGame
{
  public static void main(String[] args)
  {
    QuestWindow qw = new QuestWindow("Pokemon Rose");
    qw.setText("Welcome to Pokemon Rose\n\nLive your dream of being a Pokemon Trainer.");
    qw.setImage("images\\rose.jpg");
    qw.setFontSize(24);
    qw.setFontName("Broadway");
    qw.setBackground("Pink");
    QuestButton playBtn = new QuestButton(qw, 1, "Play Game");
    playBtn.setIdentity("Play Game");
    qw.addQuestButton(playBtn);
    qw.saveAsStart();
    GameBehavior g = new GameBehavior(qw);
  }
}
class GameBehavior extends QuestBehavior
{
  public GameBehavior(QuestWindow q)
  {
    super(q);
  }
  @Override
  //Method receives the id of the button last pressed by the user.
  public boolean performBehavior(String id)
  {
    if(id.equals("Play Game"))
    {
      top.clearButtons();
      top.setFontSize(14);
      top.setFontName("Elephant");
      top.setImage("images\\growlitheLick.jpg");
      top.setText("WACK! Your pet Growlithe slobbers all over you to wake you up. EW. But guess what?"); 
      QuestButton what =  new QuestButton(top, 3, "What?");
      what.setIdentity("What?");
      QuestButton nou  =  new QuestButton(top, 3, "no u");
      nou.setIdentity("no u");
      top.addQuestButton(what);
      top.addQuestButton(nou);
    }
     else if(id.equals("no u")) 
    { 
      top.clearButtons(); 
      top.setBackground("Black");
      top.setFontName("Narkism");
      top.setImage("images\\gameOver.jpg");
      top.setText("Stop. That's a dead meme. You die.");
      QuestButton restart = new QuestButton(top, 3, "Try again?");
      restart.setIdentity("restart");
      top.addQuestButton(restart);
  }
    else if(id.equals("What?")) 
    { 
      top.clearButtons(); 
      top.setImage("images\\bedroom.png");
      top.setText("You're 10 years old! You can start your Pokemon journey!");
      QuestButton ready = new QuestButton(top, 3, "Get up from bed and get ready.");
      ready.setIdentity("Get up from bed and get ready.");
      QuestButton sleep = new QuestButton(top, 3, "Continue sleeping.");
      sleep.setIdentity("Continue sleeping.");
      top.addQuestButton(ready);
      top.addQuestButton(sleep);
  }
    else if(id.equals("Continue sleeping.")) 
    { 
      top.clearButtons(); 
      top.setBackground("Black");
      top.setText("Well now you're late. Good job idiot. You go sicko mode and get ready super fast. Fortunately this game doesn't make you have to wait to get running shoes.");
      top.setImage("images\\girl.jpeg");
      QuestButton run = new QuestButton(top, 3, "RUN");
      run.setIdentity("RUN");
      QuestButton sprint = new QuestButton(top, 3, "SPRINT");
      sprint.setIdentity("SPRINT");
      top.addQuestButton(run);
      top.addQuestButton(sprint);
  }
    else if(id.equals("RUN") || id.equals("SPRINT") || id.equals("Get up from bed and get ready.")) 
    { 
      top.clearButtons(); 
      top.setBackground("Pink");
      top.setImage("images\\starter.png");
      top.setText("You've arrived at Profesor Redwood's lab. Time to choose your Pokemon!");
      QuestButton charmander = new QuestButton(top, 3, "Charmander");
      charmander.setIdentity("Charmander");
      QuestButton squirtle = new QuestButton(top, 3, "Squirtle");
      squirtle.setIdentity("Squirtle");
      QuestButton bulbasaur = new QuestButton(top, 3, "Bulbasaur");
      bulbasaur.setIdentity("Bulbasaur");
      top.addQuestButton(charmander);
      top.addQuestButton(squirtle);
      top.addQuestButton(bulbasaur);
  }
      else if(id.equals("Charmander") || id.equals("Squirtle") || id.equals("Bulbasaur")) 
    { 
      top.clearButtons(); 
      top.setImage("images\\squirtle.png");
      top.setText("Well, since you were late anyways, only squirtle was left. So you have squirtle now. What will name it?");
      QuestButton aqua = new QuestButton(top, 3, "Aqua");
      aqua.setIdentity("Aqua");
      QuestButton squirt = new QuestButton(top, 3, "Squirt");
      squirt.setIdentity("Squirt");
      QuestButton ricardo = new QuestButton(top, 3, "Ricardo");
      ricardo.setIdentity("Ricardo");
       top.addQuestButton(aqua);
      top.addQuestButton(squirt);
      top.addQuestButton(ricardo);
  }
      else if(id.equals("Aqua") || id.equals("Squirt") || id.equals("Ricardo")) 
    { 
      top.clearButtons(); 
      top.setText("Time to start your journey with your Growlithe and Squirtle. The view is beautiful.");
      top.setImage("images\\startJourney.jpeg");
      QuestButton walkGrass = new QuestButton(top, 3, "Walk into the tall grass");
      walkGrass.setIdentity("walkGrass");
      QuestButton runGrass = new QuestButton(top, 3, "Run into the tall grass");
      runGrass.setIdentity("runGrass");
      top.addQuestButton(walkGrass);
      top.addQuestButton(runGrass);
  }
      else if(id.equals("runGrass")) 
    { 
      top.clearButtons(); 
      top.setText("You ran into a wild Pokemon and you send out Squirtle. What should Squirtle do?");
      top.setImage("images\\wildPidgey.png");
      QuestButton tackle = new QuestButton(top, 3, "Tackle");
      tackle.setIdentity("tackle");
      QuestButton tailWhip = new QuestButton(top, 3, "Tail Whip");
      tailWhip.setIdentity("tail whip");
      top.addQuestButton(tackle);
      top.addQuestButton(tailWhip);
  }
        else if(id.equals("walkGrass")) 
    { 
      top.clearButtons(); 
      top.setText("You walked into a wild Pokemon and you send out Squirtle. What should Squirtle do?");
      top.setImage("images\\wildPidgey.png");
      QuestButton tackle = new QuestButton(top, 3, "Tackle");
      tackle.setIdentity("tackle");
      QuestButton tailWhip = new QuestButton(top, 3, "Tail Whip");
      tailWhip.setIdentity("tail whip");
      top.addQuestButton(tackle);
      top.addQuestButton(tailWhip);
  }
    else if(id.equals("tackle")) 
    { 
      top.clearButtons(); 
      top.setText("Pidgey loses 10 HP. Pidgey uses tackle. Squirtle loses 5 HP. What should Squirtle do?");
      top.setImage("images\\wildPidgey.png");
      QuestButton tackle2 = new QuestButton(top, 3, "Tackle");
      tackle2.setIdentity("tackle2");
      QuestButton tailWhip2 = new QuestButton(top, 3, "Tail Whip");
      tailWhip2.setIdentity("tail whip");
      top.addQuestButton(tackle2);
      top.addQuestButton(tailWhip2);
  }  
    else if(id.equals("tail whip")) 
    { 
      top.clearButtons(); 
      top.setText("Pidgey's defense goes down. The Pidgey uses Gust. Squirtle faints, so you switch in Growlithe.");
      top.setImage("images\\wildPidgey.jpeg");
      QuestButton tackle2grow = new QuestButton(top, 3, "Tackle");
      tackle2grow.setIdentity("tackle2grow");
      QuestButton tailWhip2 = new QuestButton(top, 3, "Tail Whip");
      tailWhip2.setIdentity("tail whip2");
      top.addQuestButton(tackle2grow);
      top.addQuestButton(tailWhip2);
  }  
    else if(id.equals("tackle2grow")) 
    { 
      top.clearButtons(); 
      top.setText("Growlithe uses tackle. Pidgey loses 20 HP and faints. Growlithe levels up and learns ember.");
      top.setImage("images\\wildPidgey.jpeg");
      QuestButton walkGrass2 = new QuestButton(top, 3, "Continue walking in grass");
      walkGrass2.setIdentity("walkGrass2");
      QuestButton runGrass2 = new QuestButton(top, 3, "Continue running in the grass");
      runGrass2.setIdentity("runGrass2");
      top.addQuestButton(walkGrass2);
      top.addQuestButton(runGrass2);
  }  
    else if(id.equals("tail whip2")) 
    { 
      top.clearButtons(); 
      top.setBackground("Black");
      top.setFontName("Narkism");
      top.setImage("images\\gameOver.jpg");
      top.setText("Pidgey's defense goes down. The Pidgey uses Gust. Growlithe faints. You lost.");
      QuestButton restart = new QuestButton(top, 3, "Try again?");
      restart.setIdentity("restart");
      top.addQuestButton(restart);
  }  
    else if(id.equals("tackle2")) 
    { 
      top.clearButtons(); 
      top.setText("Pidgey loses 10 HP and faints. Squirtle levels up and learns water gun.");
      top.setImage("images\\wildPidgey.png");
      QuestButton walkGrass2 = new QuestButton(top, 3, "Continue walking in grass");
      walkGrass2.setIdentity("walkGrass2");
      QuestButton runGrass2 = new QuestButton(top, 3, "Continue running in the grass");
      runGrass2.setIdentity("runGrass2");
      top.addQuestButton(walkGrass2);
      top.addQuestButton(runGrass2);
  }  
    else if(id.equals("walkGrass2") || id.equals("runGrass2")) 
    { 
      top.clearButtons(); 
      top.setText("You have arrived at Viridian City. You heal up your Pokemon at the Pokemon Center.");
      top.setImage("images\\PC.png");
      QuestButton rest = new QuestButton(top, 3, "Rest up for the night.");
      rest.setIdentity("rest");
      QuestButton journey = new QuestButton(top, 3, "Continue your journey");
      journey.setIdentity("journey");
      top.addQuestButton(rest);
      top.addQuestButton(journey);
  }  
    else if(id.equals("rest") || id.equals("journey")) 
    { 
      top.clearButtons(); 
      top.setText("You leave the Pokemon Center eventually. You go grind your Squirtle and Growlithe. You catch a Sandshrew and grind him too. ");
      top.setImage("images\\grind.jpg");
      QuestButton gym = new QuestButton(top, 3, "Go to the gym.");
      gym.setIdentity("gym");
      QuestButton train = new QuestButton(top, 3, "Train some more");
      train.setIdentity("train");
      top.addQuestButton(gym);
      top.addQuestButton(train);
  }  
    else if(id.equals("train")) 
    { 
      top.clearButtons(); 
      top.setText("You train some more. Do you think you're ready now? ");
      top.setImage("images\\grind.jpg");
      QuestButton gym = new QuestButton(top, 3, "Go to the gym.");
      gym.setIdentity("gym");
      QuestButton train = new QuestButton(top, 3, "Train some more");
      train.setIdentity("train");
      top.addQuestButton(gym);
      top.addQuestButton(train);
  }  
else if(id.equals("gym")) 
    { 
      top.clearButtons(); 
      top.setText("You go to fight the gym leader. He sends out a Raichu. What do you send out? ");
      top.setImage("images\\gym.png");
      QuestButton growGym = new QuestButton(top, 3, "Growlithe");
      growGym.setIdentity("growGym");
      QuestButton sandGym = new QuestButton(top, 3, "Sandshrew");
      sandGym.setIdentity("sandGym");
      QuestButton squirtGym = new QuestButton(top, 3, "Squirtle");
      squirtGym.setIdentity("squirtGym");
      top.addQuestButton(growGym);
      top.addQuestButton(sandGym);
      top.addQuestButton(squirtGym);
  }  

else if(id.equals("growGym")) 
    { 
      top.clearButtons(); 
      top.setText("Raichu is faster and uses thunderbolt. Growlithe faints. Who do you send out?");
      top.setImage("images\\raichu.jpg");
      QuestButton sandGym = new QuestButton(top, 3, "Sandshrew");
      sandGym.setIdentity("sandGym2");
      QuestButton squirtGym = new QuestButton(top, 3, "Squirtle");
      squirtGym.setIdentity("squirtGym2");
      top.addQuestButton(sandGym);
      top.addQuestButton(squirtGym);
  }  
else if(id.equals("squirtGym")) 
    { 
      top.clearButtons(); 
      top.setText("Raichu is faster and uses thunderbolt. Squirtle faints. Who do you send out?");
      top.setImage("images\\raichu.jpg");
      QuestButton sandGym = new QuestButton(top, 3, "Sandshrew");
      sandGym.setIdentity("sandGym2");
      QuestButton growGym2 = new QuestButton(top, 3, "Growlithe");
      growGym2.setIdentity("growGym2");
      top.addQuestButton(sandGym);
      top.addQuestButton(growGym2);
  }  
else if(id.equals("growGym2")) 
    { 
      top.clearButtons(); 
      top.setText("Raichu is faster and uses thunderbolt. Growlithe faints. Who do you send out?");
      top.setImage("images\\raichu.jpg");
      QuestButton sandGym = new QuestButton(top, 3, "Sandshrew");
      sandGym.setIdentity("sandGym2");
      QuestButton giveUp = new QuestButton(top, 3, "Give up.");
      giveUp.setIdentity("give up");
      top.addQuestButton(sandGym);
      top.addQuestButton(giveUp);
  }  
else if(id.equals("squirtGym2")) 
    { 
      top.clearButtons(); 
      top.setText("Raichu is faster and uses thunderbolt. Squirtle faints. Who do you send out?");
      top.setImage("images\\raichu.jpg");
      QuestButton sandGym = new QuestButton(top, 3, "Sandshrew");
      sandGym.setIdentity("sandGym2");
      QuestButton giveUp = new QuestButton(top, 3, "Give up.");
      giveUp.setIdentity("give up");
      top.addQuestButton(sandGym);
      top.addQuestButton(giveUp);
  }  
else if(id.equals("sandGym2") || id.equals("sandGym")) 
    { 
      top.clearButtons(); 
      top.setText("Raichu is faster and uses thunderbolt but it doesn't affect you. Sandshrew uses earthquake. Raichu faints. The gym leader sends out Onix.");
      top.setImage("images\\onix.png");
      QuestButton earthquake = new QuestButton(top, 3, "Earthquake");
      earthquake.setIdentity("earthquake");
      QuestButton giveUp = new QuestButton(top, 3, "Give up.");
      giveUp.setIdentity("give up");
      top.addQuestButton(earthquake);
      top.addQuestButton(giveUp);
  }  
else if(id.equals("earthquake") ) 
    { 
      top.clearButtons(); 
      top.setText("Sandshrew uses Earthquake. Onix is knocked out. You recieve the Basic Badge!");
      top.setImage("images\\badge.png");
      QuestButton yay = new QuestButton(top, 3, "YAY!");
      yay.setIdentity("yay");
      QuestButton woohoo = new QuestButton(top, 3, "WOOHOO");
      woohoo.setIdentity("woohoo");
      top.addQuestButton(yay);
      top.addQuestButton(woohoo);
  }  
else if(id.equals("tackleSand") ) 
    { 
      top.clearButtons(); 
      top.setText("Sandshrew uses Tackle. It's not very effective. Onix uses rock throw. Sandshrew faints.");
      top.setImage("images\\onix.png");
      QuestButton yay = new QuestButton(top, 3, "YAY!");
      yay.setIdentity("yay");
      QuestButton woohoo = new QuestButton(top, 3, "WOOHOO");
      woohoo.setIdentity("woohoo");
      top.addQuestButton(yay);
      top.addQuestButton(woohoo);
  }  
else if(id.equals("yay") || id.equals("woohoo") ) 
    { 
      top.clearButtons(); 
      top.setText("You go to the Pokemon Center and heal up. Take a good night of rest.");
      top.setImage("images\\PC.png");
      QuestButton wake= new QuestButton(top, 3, "Wake up.");
      wake.setIdentity("wake");
      QuestButton sleep = new QuestButton(top, 3, "Sleep some more.");
      sleep.setIdentity("sleep");
      top.addQuestButton(wake);
      top.addQuestButton(sleep);
  }  
else if(id.equals("sleep") ) 
    { 
      top.clearButtons(); 
      top.setText("You slept some more.");
      top.setImage("images\\PC.png");
      QuestButton wake= new QuestButton(top, 3, "Wake up.");
      wake.setIdentity("wake");
      QuestButton sleep = new QuestButton(top, 3, "Sleep some more.");
      sleep.setIdentity("sleep");
      top.addQuestButton(wake);
      top.addQuestButton(sleep);
  }  
else if(id.equals("wake") ) 
    { 
      top.clearButtons(); 
      top.setText("You leave your bed and continue your journey. Right before you reach Cerulean Cave, you meet a member of Team Rocket.");
      top.setImage("images\\teamRocket.png");
      QuestButton who = new QuestButton(top, 3, "Who are they?");
      who.setIdentity("who");
      QuestButton fight = new QuestButton(top, 3, "Fight!");
      fight.setIdentity("fight");
      top.addQuestButton(who);
      top.addQuestButton(fight);
  }  
else if(id.equals("who") ) 
    { 
      top.clearButtons(); 
      top.setText("They are Jesse and James! They are notrious for blasting off.");
      top.setImage("images\\teamRocket.png");
      QuestButton who = new QuestButton(top, 3, "Who are they, again?");
      who.setIdentity("who");
      QuestButton fight = new QuestButton(top, 3, "Fight!");
      fight.setIdentity("fight");
      top.addQuestButton(who);
      top.addQuestButton(fight);
  }  
else if(id.equals("fight") ) 
    { 
      top.clearButtons(); 
      top.setText("They send out Meowth. Who will you send out?");
      top.setImage("images\\teamRocket.png");
      QuestButton squirtleRocket = new QuestButton(top, 3, "Squirtle");
      squirtleRocket.setIdentity("squirtleRocket");
      QuestButton growlitheRocket = new QuestButton(top, 3, "Growlithe");
      growlitheRocket.setIdentity("growlitheRocket");
      QuestButton sandshrewRocket = new QuestButton(top, 3, "Sandshrew");
      sandshrewRocket.setIdentity("sandshrewRocket");
      top.addQuestButton(squirtleRocket);
      top.addQuestButton(growlitheRocket);
      top.addQuestButton(sandshrewRocket);
  }  
else if(id.equals("squirtleRocket") ) 
    { 
      top.clearButtons(); 
      top.setText("What will Squirtle do?");
      top.setImage("images\\teamRocket.png");
      QuestButton tackle = new QuestButton(top, 3, "Tackle");
      tackle.setIdentity("tackleMeowth");
      QuestButton waterGun = new QuestButton(top, 3, "Watergun");
      waterGun.setIdentity("waterMeowth");
      top.addQuestButton(tackle);
      top.addQuestButton(waterGun);
  }  
else if(id.equals("tackleMeowth") || id.equals("waterMeowth")) 
    { 
      top.clearButtons(); 
      top.setText("MEOWTH GIVES YOU THE MIDDLE FINGER! Squirtle with rage doesn't listen to you.");
      top.setImage("images\\meowthMiddle.png");
      QuestButton switchOut = new QuestButton(top, 3, "Switch Squirtle out.");
      switchOut.setIdentity("switchOut");
      QuestButton callOut = new QuestButton(top, 3, "Call out Squirtle's name.");
      callOut.setIdentity("call");
      top.addQuestButton(switchOut);
      top.addQuestButton(callOut);
  }  
else if(id.equals("call")) 
    { 
      top.clearButtons(); 
      top.setText("Squirtle still isn't listening.");
      top.setImage("images\\meowthMiddle.png");
      QuestButton switchOut = new QuestButton(top, 3, "Switch Squirtle out.");
      switchOut.setIdentity("switchOut");
      QuestButton callOut = new QuestButton(top, 3, "Call out Squirtle's name.");
      callOut.setIdentity("call");
      top.addQuestButton(switchOut);
      top.addQuestButton(callOut);
  }  
else if(id.equals("switchOut")) 
    { 
      top.clearButtons(); 
      top.setText("Who will you switch out with?");
      top.setImage("images\\meowthMiddle.png");
      QuestButton growlitheRocket = new QuestButton(top, 3, "Growlithe");
      growlitheRocket.setIdentity("growlitheRocket");
      QuestButton sandshrewRocket = new QuestButton(top, 3, "Sandshrew");
      sandshrewRocket.setIdentity("sandshrewRocket");
      top.addQuestButton(sandshrewRocket);
      top.addQuestButton(growlitheRocket);
  }  
else if(id.equals("growlitheRocket")) 
    { 
      top.clearButtons(); 
      top.setText("What should Growlithe do?");
      top.setImage("images\\meowthMiddle.png");
      QuestButton tackle = new QuestButton(top, 3, "Tackle");
      tackle.setIdentity("tackleMeowth2");
      QuestButton ember = new QuestButton(top, 3, "Ember");
      ember.setIdentity("ember");
      top.addQuestButton(tackle);
      top.addQuestButton(ember);
  }  
else if(id.equals("tackleMeowth2") || id.equals("ember") || id.equals("earth")) 
    { 
      top.clearButtons(); 
      top.setText("Meowth loses 10 HP and faints. Team Rocket. They leave behind two fossils. You take both. Which one do you wanna look closely at?");
      top.setImage("images\\fossils.jpg");
      QuestButton dome = new QuestButton(top, 3, "Dome");
      dome.setIdentity("dome");
      QuestButton helix = new QuestButton(top, 3, "Helix");
      helix.setIdentity("helix");
      top.addQuestButton(dome);
      top.addQuestButton(helix);
  }  
else if(id.equals("sandshrewRocket")) 
    { 
      top.clearButtons(); 
      top.setText("What should Sandshrew do?");
      top.setImage("images\\meowthMiddle.png");
      QuestButton tackle = new QuestButton(top, 3, "Tackle");
      tackle.setIdentity("tackleMeowth2");
      QuestButton earth = new QuestButton(top, 3, "Earthquake");
      earth.setIdentity("earth");
      top.addQuestButton(tackle);
      top.addQuestButton(earth);
  }  
else if(id.equals("helix")) 
    { 
      top.clearButtons(); 
      top.setText("You look at the Helix fossil. A spiritual energy is emanating from it.");
      top.setImage("images\\meowthMiddle.png");
      QuestButton walk = new QuestButton(top, 3, "Walk into Cerulean Cave");
      walk.setIdentity("walkCave");
      QuestButton run = new QuestButton(top, 3, "Run into Cerulean Cave");
      run.setIdentity("runCave");
      top.addQuestButton(walk);
      top.addQuestButton(run);
  }  
else if(id.equals("dome")) 
    { 
      top.clearButtons(); 
      top.setText("You look at the Dome fossil. It feels like nothing.");
      top.setImage("images\\meowthMiddle.png");
      QuestButton walk = new QuestButton(top, 3, "Walk into Cerulean Cave");
      walk.setIdentity("walkCave");
      QuestButton run = new QuestButton(top, 3, "Run into Cerulean Cave");
      run.setIdentity("runCave");
      top.addQuestButton(walk);
      top.addQuestButton(run);
  }  
else if(id.equals("walkCave") || id.equals("runCave"))
    {
      top.clearButtons(); 
      top.setText("As you enter the cave, a sudden shiver run downs your spine. Someone's watching.");
      top.setImage("images\\cave.png");
      QuestButton hello = new QuestButton(top, 3, "Say, HELLOOOOO");
      hello.setIdentity("hello");
      QuestButton there = new QuestButton(top, 3, "Say, IS ANYONE THERE");
      there.setIdentity("there");
      top.addQuestButton(hello);
      top.addQuestButton(there);
  }  
else if(id.equals("hello") || id.equals("there"))
    {
      top.clearButtons(); 
      top.setText("As you walk deeper, you see the menacing Mewtwo. Which fossil will you offer him?");
      top.setImage("images\\mewtwoCave.png");
      QuestButton domeOff = new QuestButton(top, 3, "Dome");
      domeOff.setIdentity("domOff");
      QuestButton helixOff = new QuestButton(top, 3, "Helix");
      helixOff.setIdentity("helixOff");
      top.addQuestButton(domeOff);
      top.addQuestButton(helixOff);
  }  
else if(id.equals("helixOff"))
    {
      top.clearButtons(); 
      top.setText("Mewtwo gasps and kneels down. He will serve what he believes to be Lord Helix and his trainer. Mewtwo is now at your command.");
      top.setImage("images\\mewtwo.png");
      QuestButton master = new QuestButton(top, 3, "Become the Pokemon Master");
      master.setIdentity("master");
      QuestButton rule = new QuestButton(top, 3, "Rule the World");
      rule.setIdentity("rule");
      top.addQuestButton(master);
      top.addQuestButton(rule);
  }  
else if(id.equals("master"))
    {
      top.clearButtons(); 
      top.setText("You become the Pokemon master with Mewtwo. You've achieved your dreams.");
      top.setImage("images\\pkmnMaster.jpg");
      QuestButton restart = new QuestButton(top, 3, "Be reborn?");
      restart.setIdentity("restart");
      top.addQuestButton(restart);
  }  
else if(id.equals("rule"))
    {
      top.clearButtons(); 
      top.setText("You take over all the towns. Other legendary Pokemon come to stop you.");
      top.setImage("images\\mewtwo.png");
      QuestButton kill = new QuestButton(top, 3, "Kill them");
      kill.setIdentity("kill");
      QuestButton join = new QuestButton(top, 3, "Let them join you");
      join.setIdentity("join");
      top.addQuestButton(kill);
      top.addQuestButton(join);
  }  
else if(id.equals("kill"))
    {
      top.clearButtons(); 
      top.setText("You kill all the Pokemon trying to stop you. Arceus comes to stop you. He uses Judgement.");
      top.setImage("images\\mewtwo.png");
      QuestButton show = new QuestButton(top, 3, "Show him the Helix Fossil");
      show.setIdentity("show");
      QuestButton killAr = new QuestButton(top, 3, "Command Mewtwo to kill him");
      killAr.setIdentity("killAr");
      top.addQuestButton(killAr);
      top.addQuestButton(show);
  }  
else if(id.equals("show"))
    {
      top.clearButtons(); 
      top.setText("You show him the Helix Fossil. Arceus bows down saying that he will listen to you every command. You rule the universe.");
      top.setImage("images\\pkmnMaster.jpg");
      QuestButton restart = new QuestButton(top, 3, "Be reborn?");
      restart.setIdentity("restart");
      top.addQuestButton(restart);
  }  
else if(id.equals("join"))
    {
      top.clearButtons(); 
      top.setText("You make them join you by showing the Helix Fossil. You're unstoppable. You have won.");
      top.setImage("images\\pkmnMaster.jpg");
      QuestButton restart = new QuestButton(top, 3, "Be reborn?");
      restart.setIdentity("restart");
      top.addQuestButton(restart);
  }  
else if(id.equals("killAr"))
    {
      top.clearButtons(); 
      top.setText("Mewtwo tries his best but is ripped into shreds by Arceus. Arceus uses Judgement on you, too. GAME OVER");
      top.setBackground("Black");
      top.setFontName("Narkism");
      top.setImage("images\\gameOver.jpg");
      QuestButton restart = new QuestButton(top, 3, "Try again?");
      restart.setIdentity("restart");
      top.addQuestButton(restart);
  }  
else if(id.equals("domOff"))
    {
      top.clearButtons(); 
      top.setBackground("Black");
      top.setFontName("Narkism");
      top.setText("Mewtwo is enrage calling you a nuisance. He executes you in one blow. GAME OVER");
     top.setImage("images\\gameOver.jpg");
      QuestButton restart = new QuestButton(top, 3, "Try again?");
      restart.setIdentity("restart");
      top.addQuestButton(restart);
  }  
else if(id.equals("give up")) 
    { 
      top.clearButtons(); 
      top.setBackground("Black");
      top.setFontName("Narkism");
      top.setImage("images\\gameOver.jpg");
      top.setText("You gave up. You should never give up. Game Over.");
      QuestButton restart = new QuestButton(top, 3, "Try again?");
      restart.setIdentity("restart");
      top.addQuestButton(restart);
  }  

    
    //restarting the game
    else if(id.equals("restart"))
    {
      top.restart(); //because we did qw.saveAsStart we will
    }
    return true;
}
}