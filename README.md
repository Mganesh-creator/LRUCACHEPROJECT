# 🧠 LRU Cache Project (Java)

A simple **Least Recently Used (LRU) Cache** implementation in Java.  
This project demonstrates how caching works when you have limited memory — the cache automatically removes the **least recently used** element when it reaches its capacity.

---

## 🚀 Features
- Fast **O(1)** access and update operations.
- Automatically evicts least recently used items.
- Implemented using a combination of **HashMap** and **Doubly Linked List**.
- Well-structured, beginner-friendly Java code.

---

## 🛠️ How to Run

### ✅ Step 1: Compile the Java files
Open your terminal inside the project folder and run:
```bash
javac Main.java LRUCache.java
```

### ✅ Step 2: Run the program
```bash
java Main
```

---

## 🧩 Example Output
```
Putting key=1, value=10
Putting key=2, value=20
Accessing key=1 -> 10
Putting key=3, value=30 (Evicts least recently used)
Cache contents: [1, 3]
```

---

## 📂 Project Structure
```
LRUCACHEPROJECT/
│
├── LRUCache.java      # Core LRU cache logic
├── Main.java          # Entry point / test driver
├── src/               # Optional folder for organized code
├── .gitignore         # Git ignore rules
└── README.md          # This documentation
```

---

## 🧑‍💻 Author
**Ganesh M**  
GitHub: [Mganesh-creator](https://github.com/Mganesh-creator)

---

## 📜 License
This project is licensed under the **MIT License** — feel free to use and modify it.
