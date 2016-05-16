package levelGraph;

public class Vertex {
  final private String id;
  final private String name;
  final private String coordX;
  final private String coordY;
  
  public Vertex(String id, String x, String y) {
    this.id = id;
    this.name = id;
    this.coordX = x;
    this.coordY = y;
  }

    Vertex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  public String getId() {
    return id;
  }
  
  public String getCoordX()
  {
      return coordX;
  }
  
  public String getCoordY()
  {
      return coordY;
  }

  public String getName() {
    return name;
  }
  
   @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Vertex other = (Vertex) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return name;
  }
} 
