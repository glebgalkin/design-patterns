# Design Patterns
## Creational
### Factory Method

```mermaid
graph TD;
    Interface Product-->class DressProduct;
    Interface Product-->class ShoesProduct;
    Abstract Class Store-->DressStore;
    Abstract Class Store-->ShoeStore;
```
