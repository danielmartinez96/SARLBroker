package Events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Daniel
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class Bid extends Event {
  public float precio;
  
  public float envio;
  
  public float total;
  
  public Bid(final float p, final float e) {
    this.precio = p;
    this.envio = e;
    this.total = (p + e);
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
    Bid other = (Bid) obj;
    if (Float.floatToIntBits(other.precio) != Float.floatToIntBits(this.precio))
      return false;
    if (Float.floatToIntBits(other.envio) != Float.floatToIntBits(this.envio))
      return false;
    if (Float.floatToIntBits(other.total) != Float.floatToIntBits(this.total))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Float.floatToIntBits(this.precio);
    result = prime * result + Float.floatToIntBits(this.envio);
    result = prime * result + Float.floatToIntBits(this.total);
    return result;
  }
  
  /**
   * Returns a String representation of the Bid event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("precio", this.precio);
    builder.add("envio", this.envio);
    builder.add("total", this.total);
  }
}
