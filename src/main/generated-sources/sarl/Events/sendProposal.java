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
public class sendProposal extends Event {
  public float mejorPrecio;
  
  public sendProposal(final float mp) {
    this.mejorPrecio = mp;
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
    sendProposal other = (sendProposal) obj;
    if (Float.floatToIntBits(other.mejorPrecio) != Float.floatToIntBits(this.mejorPrecio))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Float.floatToIntBits(this.mejorPrecio);
    return result;
  }
  
  /**
   * Returns a String representation of the sendProposal event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("mejorPrecio", this.mejorPrecio);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 803750144L;
}
