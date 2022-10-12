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

### Builder

```mermaid
graph TD;
    InterfaceBuilder-->classPLaneBuilder;
    ClassPlane;
    ClassDirector;
    Demo
```

### Prototype
```mermaid
graph TD;
    InterfaceSpeaker-->classFocal;
    Demo
```
### Singleton
```mermaid
graph TD;
    Singleton;
    Demo
```

## Structural 
### Adapter
```mermaid
graph TD;
    XMLtoJSONconverter
    Demo
```

### Bridge
```mermaid
graph TD;
    Athlete-->HockeyPlayer;
    Athlete-->SoccerPlayer;
    Coach-->StrengthCoach;
    Coach-->MentalHealthCoach;
    Demo;
```

### Composite
```mermaid
graph TD;
    ItemINterface-->AbstractBaseItem;
    AbstractBaseItem-->ClassDress;
    AbstractBaseItem-->ClassHeels;
    AbstractBaseItem-->Pants;
    AbstractBaseItem-->Bundle;
    ClassCart;
    Demo;
```

### Decorator
```mermaid
graph TD;
    TaxCalculatorInterface-->FederalTaxCalculatorClass;
    FederalTaxCalculatorClass-->QuebecTaxCalculatorClass;
    Demo;
```

### Facade
```mermaid

graph TD;
    AbstractClass-->CSCourse;
    AbstractClass-->ElectiveCourse;
    InterfaceInsurance-->StudentInsuranceClass;
    GraduationInterface-->StudentGrad;
    StudentPortalFacade;
    Demo;
```

### Lightweight
```mermaid
graph TD;
    ArmyManInterface-->SoldierClass;
    SoldierFactory;
    Demo;
```

### Proxy
```mermaid
graph TD;
    FileRefInterface-->FileEngineClass;
    FileRefInterface-->FileCache;
    Demo;
```

## Behavioral
### Chain of responsibility
```mermaid
graph TD;
    AbstractClassMiddleWare-->RegularCheck;
    AbstractClassMiddleWare-->RoleCheck;
    ClassServer;
    Demo;
```
### Command
```mermaid
graph TD;
    CommandInterface-->SellCurrency;
    CommandInterface-->BuyCurrency;
    ClassBankWorker;
    Demo;
```

### Iterator
```mermaid
graph TD;
    FoodIteratorInterface-->DonutIterator;
    FoodIteratorInterface-->ChocolateIterator;
    FoodClass-->Donut;
    FoodClass-->Chocolate;
    Demo;
```

### Mediator
```mermaid
graph TD;
    EmployeeInterface-->FrontDesk;
    EmployeeInterface-->Waiter;
    EmployeeInterface-->Chief;
    EmployeeInterface-->Accountant;
    MediatorInterface-->RestaurantManager;
    Demo;
```

### Memento
```mermaid
graph TD;
    MementoInterface-->HistoryManager;
    Demo;
```

 
