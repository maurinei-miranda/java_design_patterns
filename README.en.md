# 💡 Design Patterns in Java

Repository with implementations of the main Design Patterns in Java, maintained as a personal reference and reinforcement exercise.

---

## 📦 Creational Patterns

### 1. Singleton - Logger  
**Challenge:** Implement a `Logger` class that ensures a single instance throughout the system.  
**Instructions:**
- Use `private static` to store the instance.  
- Provide a `getInstance()` method.

---

### 2. Factory Method - Notifications  
**Challenge:** Create a `NotificationFactory` that can instantiate `EmailNotification`, `SMSNotification`, or `PushNotification`.  
**Instructions:**
- Create a `Notification` interface.  
- Implement concrete classes for each notification type.

---

### 3. Abstract Factory - UI Components  
**Challenge:** Create a factory to generate UI components according to the operating system (`WindowsUIFactory`, `MacUIFactory`).  
**Instructions:**
- Create interfaces for components (`Button`, `Checkbox`, etc).  
- Implement OS-specific versions for Windows and Mac.

---

### 4. Builder - Report Generator  
**Challenge:** Build reports in different formats (PDF, HTML, CSV) using a `ReportBuilder`.  
**Instructions:**
- Create a `ReportDirector` class that uses the builder.  
- Implement concrete builders for each format.

---

### 5. Prototype - Game Characters  
**Challenge:** Model a system where characters can be cloned from a prototype.  
**Instructions:**
- Use the `Cloneable` interface.  
- Implement the `clone()` method in concrete classes.

---

## 🧱 Structural Patterns

### 6. Adapter - Payment System  
**Challenge:** Adapt an old payment system to work with a new one.  
**Instructions:**
- Create a `PaymentAdapter` that translates calls.

---

### 7. Bridge - Remote Control  
**Challenge:** Separate abstraction (`RemoteControl`) from implementation (`TV`, `Radio`).  
**Instructions:**
- The abstraction calls methods from the implementation.

---

### 8. Composite - File System  
**Challenge:** Model folders and files where folders can contain multiple elements.  
**Instructions:**
- Use a common interface `FileSystemNode`.  
- Implement `File` and `Folder`.

---

### 9. Decorator - Coffee Shop  
**Challenge:** Allow adding ingredients dynamically to a coffee.  
**Instructions:**
- Create a `Beverage` interface.  
- Use decorators for `Milk`, `Chocolate`, etc.

---

### 10. Facade - Online Shopping  
**Challenge:** Create a facade (`OrderService`) that coordinates `Inventory`, `Payment`, and `Shipping`.  
**Instructions:**
- Create subsystems and encapsulate them in a simple interface.

---

### 11. Flyweight - Text Editor  
**Challenge:** Reuse character instances to save memory.  
**Instructions:**
- Store shared characters in a `CharacterFactory`.

---

### 12. Proxy - File System Access  
**Challenge:** Implement a security proxy for different user types.  
**Instructions:**
- Control access based on user type.

---

## 🤝 Behavioral Patterns

### 13. Chain of Responsibility - HTTP Validator  
**Challenge:** Create chained validators for authentication, permissions, and format.  
**Instructions:**
- Each handler should delegate to the next if it doesn't process.

---

### 14. Command - Remote Control  
**Challenge:** Encapsulate commands like `turn on TV`, `increase volume`, etc.  
**Instructions:**
- Use a `Command` interface.

---

### 15. Interpreter - Math Commands  
**Challenge:** Interpret expressions like `x = 5 + 3`.  
**Instructions:**
- Model an expression tree and interpret it.

---

### 16. Iterator - Music Playlist  
**Challenge:** Navigate through songs using an iterator.  
**Instructions:**
- Create a `MusicIterator`.

---

### 17. Mediator - Group Chat  
**Challenge:** Centralize communication between users via `ChatMediator`.  
**Instructions:**
- Users communicate through the mediator.

---

### 18. Memento - Text Editor with Undo  
**Challenge:** Allow saving and restoring text state.  
**Instructions:**
- Use `Memento` objects to store states.

---

### 19. Observer - Weather Alert  
**Challenge:** Devices automatically update when the weather changes.  
**Instructions:**
- Use an `Observer` interface.

---

### 20. State - Vending Machine  
**Challenge:** Change behavior based on the machine’s state.  
**Instructions:**
- Model states as objects.

---

### 21. Strategy - Sorting  
**Challenge:** Implement different sorting strategies.  
**Instructions:**
- Create a `SortStrategy` interface.

---

### 22. Template Method - Beverage Preparation  
**Challenge:** Model a process with fixed and customizable steps.  
**Instructions:**
- Create an abstract class with a `prepare()` method.

---

### 23. Visitor - Tax Calculation  
**Challenge:** Apply tax rules to different products using `Visitor`.  
**Instructions:**
- Implement the pattern to avoid using `instanceof`.
