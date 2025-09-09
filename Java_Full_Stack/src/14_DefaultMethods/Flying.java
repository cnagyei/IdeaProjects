/*
Add new default method
There is an interface Flying that has a method getHeight returning the height of flying in meters.
Add and implement a default method getHeightInKm that returns height of flying in kilometers.

Sample Input 1:
1000

Sample Output 1:
1
 */
interface Flying {
    // returns height of flying in meters
    int getHeight();

    // implements a default method getHeightInKm that returns height of flying in km as int type
    default int getHeightInKm () {
        return getHeight() / 1000;
    }
}
