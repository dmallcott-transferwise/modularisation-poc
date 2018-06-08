# modularisation-poc
This repo contains a PoC multi module app relying on dagger for dependecy injection. Please check folder One. It's where the magic happens.

TL;DR: By relying on subcomponents we can have independent feature modules that get their dagger subtree generated at runtime. 
Although not the goal, this approach is scalable enough that instant apps can be achieved with minimum effort.

* `One` contains the most up to date example. This is the most sccalable aproach I could come up with given our current codebase.
* `Two` second option form my presentation.
* `ImplicitUrls` just an experiment to have communications across modules through implicit Intents. Really interesting concept that makes our app ressemble more micro services. (Please ignore the gateway module, that was a test)

The two important problems of modularisation is how modules communicate with each other and how the can share the same dependencies. 

1. There's two ways of sharing dependencies atm. Either having a "base" module capable of instantiating and sharing dependencies (usually via singletons) or having the app module instantiate and share the dependencies it needs.
2. Option `One` communicates directly with dependant modules whilst `ImplicitUrls` does so in an implicit way that removes the necesity of module dependency.

I will document this better.
