# Design Patterns
## Creational
### Factory Method

```mermaid
graph TD;
    InterfaceProduct-->classDressProduct;
    InterfaceProduct-->classShoesProduct;
    AbstractClassStore-->DressStore;
    AbstractClassStore-->ShoeStore;
    Demo
```
### Abstract Factory

```mermaid
graph TD;
    InterfacePhone-->classAppleIphone;
    InterfacePhone-->classSamsungGalaxy;
    InterfaceLaptop-->classAppleMac;
    InterfaceLaptop-->classSamsungPC;
    InterfaceFactory-->AppleFactory;
    InterfaceFactory-->SamsungDactory;
    Demo
```
