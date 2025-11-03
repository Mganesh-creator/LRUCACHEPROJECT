# 🚀 LRU Cache Implementation in Java

### 🧑‍💻 Mini Project by *Maddepuri Ganesh*  
**Department of Information Technology**  
**Sreenidhi Institute of Science and Technology**

---

## 🧾 Project Overview
This mini project focuses on the design and implementation of a **Least Recently Used (LRU) Cache** in Java.  
The LRU Cache is a high-performance data structure that stores data efficiently and automatically discards the **least recently used** entries when capacity is reached.

This project demonstrates:
- Efficient use of **HashMap** and **Doubly Linked List**
- Real-world application of **cache algorithms**
- Object-Oriented Design & Java programming skills

---

## 🎯 Objectives
- Implement a cache system with **O(1)** operations for both `get()` and `put()`.
- Understand **data structure design** using linked lists and hashing.
- Provide a **practical example** of memory optimization using caching.

---

## ⚙️ System Design

### 🔹 Data Structures Used:
- **HashMap:** Stores key–node pairs for O(1) access.
- **Doubly Linked List:** Maintains access order (most recently used → least recently used).

### 🧩 Working:
1. When data is accessed → move it to the front (most recently used position).  
2. When cache is full → remove the least recently used item from the tail.  
3. Both operations take constant time.

---

## 🧠 Code Structure
LRUCACHEPROJECT/
│
├── src/
│ ├── LRUCache.java # Core LRU Cache logic
│ └── Main.java # Driver / Demo class
│
├── .gitignore
├── LICENSE
└── README.md


---

 ## 💻 Sample Execution
```bash
Input:
Put(1, 10)
Put(2, 20)
Get(1)
Put(3, 30)
Get(2)

Output:
10
-1



Explanation:

1.Cache initially: {}

2.After Put(1,10) → {1=10}

3.After Put(2,20) → {2=20, 1=10}

4.Get(1) → returns 10, makes 1 most recently used → {1=10, 2=20}

5.Put(3,30) → Cache full, removes least used (2) → {3=30, 1=10}

6.Get(2) → -1 (not found)






git clone https://github.com/Mganesh-creator/LRUCACHEPROJECT.git

📄 License

This project is licensed under the MIT License.


🧑‍🎓 Author

Maddepuri Ganesh
Department of Information Technology
Sreenidhi Institute of Science and Technology

📌 GitHub: Mganesh-creator

📎 Repository: LRUCACHEPROJECT

⭐ If you find this project useful, consider giving it a star on GitHub!