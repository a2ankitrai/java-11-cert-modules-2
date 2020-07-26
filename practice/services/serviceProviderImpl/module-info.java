/** The module declaration requires the module containing the interface as a dependency.
We don't export the package that implements the interface since we don't want
callers referring to it directly. Instead, we use the provides directive.
This allows us to specify that we provide an implementation of the interface
 with a specific implementation class.
*/
module zoo.tours.agency{

  requires zoo.tours.api;

  provides zoo.tours.api.Tour with zoo.tours.agency.TourImpl;
}
