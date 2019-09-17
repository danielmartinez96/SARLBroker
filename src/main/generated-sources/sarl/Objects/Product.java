package Objects;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.Objects;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Daniel
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Product {
  private String codigo;
  
  private float precio;
  
  private float envio;
  
  public Product(final String c, final float p, final float e) {
    this.codigo = c;
    this.precio = p;
    this.envio = e;
  }
  
  @Pure
  public String getCodigo() {
    return this.codigo;
  }
  
  @Pure
  public float getPrecio() {
    return this.precio;
  }
  
  @Pure
  public float getEnvio() {
    return this.envio;
  }
  
  @Pure
  public float getTotal() {
    return (this.envio + this.precio);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Product other = (Product) obj;
    if (!Objects.equals(this.codigo, other.codigo)) {
      return false;
    }
    if (Float.floatToIntBits(other.precio) != Float.floatToIntBits(this.precio))
      return false;
    if (Float.floatToIntBits(other.envio) != Float.floatToIntBits(this.envio))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.codigo);
    result = prime * result + Float.floatToIntBits(this.precio);
    result = prime * result + Float.floatToIntBits(this.envio);
    return result;
  }
}
