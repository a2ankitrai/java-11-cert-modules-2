
/***
We need requires because we depend on the service provider interface.
We need provides so the ServiceLocator can look up the service.
Additionally, we need uses since we are looking up the service interface from another module.
*/
module zoo.tours.hybrid {

  requires zoo.tours.api;
  provides zoo.tours.api.Tour with zoo.tours.hybrid.QuickTourImpl;
  uses zoo.tours.api.Tour;
}
