# Lab3

### Tudor Badea 2A2


#### Compulsory (1p)

The Tourist Trip Planning Problem
A tourist is about to visit a city. In this city, there are various locations such as tourism sites, hotels and restaurants, parks, etc. Locations have names and may have other common properties (such as a description, an image, coordinates, etc). Depending on its type, each location has various specific properties. However, if the location is a visitable, it must have opening hours. If the location is payable, it must have the entry fee (the price of the ticket). If the location is classifiable, it must have a classification (a rank).
The time (in minutes) required to go from one location to another is known. The tourist has also preferences regarding the order in which he (or she) would like to visit some locations.
Example: locations are: v1 (Hotel) v2 (Museum A) v3 (Museum B) v4 (Church A) v5 (Church B) v6 (Restaurant).

| From-To | Cost |
|---------|------|
| v1->v2  | 10   |
| v1->v3  | 50   |
| v2<->v3 | 20   |
| v2->v4  | 20   |
| v2-v5   | 10   |
| v3->v4  | 20   |
| v4<->v5 | 30   |
| v4->v6  | 10   |
| v5->v6  | 20   |

The main specifications of the application are:

Compulsory (1p)

Create an object-oriented model of the problem. You should have at least the following classes City, Hotel, Museum, Church, Restaurant. The natural ordering of their objects is given by their names.

Create the interfaces Visitable, Payable, Classifiable. The classes above must implement these interfaces accordingly.

The City class will contain a List of locations.

Each location will contain a Map representing the times required to go from this location to others.

Create all the objects given in the example.


## Usage
Run the main class for the compulsory part.
