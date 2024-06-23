# Dynamic Connectivity Problem

Given a set of n elements:

## Union Command
- **Union command**: Connect two objects.
- **Find**: Determine whether there is a path connecting two objects using reflexive, symmetric, or transitive properties.

## Demonstration of Dynamic connectivity | Modelling the connections
If I have 3 objects `p`, `q`, `r`, are they connected?
1. **Reflexive**: `p` is directly connected to `p`.
2. **Symmetric**: If `p` is connected to `q`, then `q` is connected to `p`.
3. **Transitive**: If `p` is connected to `q` and `q` is connected to `r`, then `p` is connected to `r`.

<details>
    <summary><h3>Example of maximum set of mutually connected objects</h3></summary>
    <img src="../../assets/images/object_connections.png" alt="Example of maximum set of mutually connected objects">
</details>

<details>
    <summary><h3>Example Question</h3></summary>
    <img src="../../assets/images/dynamic_connectivity_image.png" alt="Example Question">
</details>

<details>
  <summary><h3>Real-World Applications | Modelling of the objects</h3></summary>
Dynamic connectivity can be applied in various real-world applications, including:

| Application Domain                       | Examples                                                 |
|------------------------------------------|----------------------------------------------------------|
| **Network Connectivity**                 | - Computer Networks<br>- Social Networks                 |
| **Image Processing**                     | - Segmentation<br>- Object Recognition                   |
| **Percolation Theory**                   | - Material Science<br>- Epidemiology                     |
| **Graph Algorithms**                     | - Minimum Spanning Trees<br>- Cycle Detection            |
| **Database Management**                  | - Equivalence Queries<br>- Partition Management          |
| **Physics and Chemistry**                | - Cluster Analysis<br>- Phase Transitions                |
| **Geographic Information Systems (GIS)** | - Routing and Navigation<br>- Land Management            |
| **Game Development**                     | - Pathfinding<br>- Region Management                     |
| **Software Engineering**                 | - Version Control Systems<br>- Dynamic Memory Management |
| **Distributed Systems**                  | - Resource Allocation                                    |

</details>

### Operations | DATA STRUCTURE TO SOLVE DYNAMIC CONNECTIVITY
- Using [quick-find]()