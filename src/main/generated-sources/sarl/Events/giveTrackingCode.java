package Events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.Objects;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Daniel
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class giveTrackingCode extends Event {
  public String trackingCode;
  
  public giveTrackingCode(final String t) {
    this.trackingCode = t;
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
    giveTrackingCode other = (giveTrackingCode) obj;
    if (!Objects.equals(this.trackingCode, other.trackingCode)) {
      return false;
    }
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.trackingCode);
    return result;
  }
  
  /**
   * Returns a String representation of the giveTrackingCode event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("trackingCode", this.trackingCode);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = -1702449015L;
}
