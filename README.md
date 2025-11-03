# Design and Implementation of an LRU Cache in Java

## 📘 Overview
This project implements a **Least Recently Used (LRU) Cache** in Java.  
The LRU Cache is a data structure that efficiently stores key-value pairs while automatically removing the least recently used entry when the cache reaches its maximum capacity.

This project demonstrates understanding of:
- Data structures (HashMap and Doubly Linked List)
- Algorithm optimization
- Object-oriented programming concepts in Java

---

## 🧠 Features
- Implements LRU caching mechanism with O(1) access and update time.
- Uses **HashMap** for constant-time lookups.
- Maintains a **Doubly Linked List** to track the order of usage.
- Handles cache insertion, retrieval, and eviction automatically.

---

## ⚙️ How It Works
1. When a key is accessed, it is moved to the front (most recently used position).
2. When a new key is added and the cache is full, the least recently used key is removed.
3. Operations such as `get()` and `put()` work in **O(1)** time complexity.

---

## 🧩 Project Structure
LRUCACHEPROJECT/
│
├── src/
│ ├── LRUCache.java # Core cache logic
│ └── Main.java # Demonstration / test file
│
├── .gitignore
├── LICENSE
└── README.md

---

## 🖥️ Sample Output
Cache after inserting (1, 10): [1=10]
Cache after inserting (2, 20): [2=20, 1=10]
Accessing key 1 → moves it to the front: [1=10, 2=20]
Cache full. Adding (3, 30) → removes least recently used (2)
Final Cache State: [3=30, 1=10]


---

## 🚀 How to Run
1. Clone this repository:
   
    ```bash
   git clone https://github.com/Mganesh-creator/LRUCACHEPROJECT.git

2. Navigate to the project folder:

   cd LRUCACHEPROJECT/src

3. Compile and run the program:

   javac Main.java
   java Main

📄 License

This project is licensed under the MIT License — see the LICENSE
 file for details.

👨‍💻 Author

Maddepuri Ganesh
Department of Information Technology
Sreenidhi Institute of Science and Technology
📎 GitHub Repository









