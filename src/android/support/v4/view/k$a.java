package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

final class k$a
  extends SingleLineTransformationMethod
{
  private Locale fQ;
  
  public k$a(Context paramContext)
  {
    fQ = getResourcesgetConfigurationlocale;
  }
  
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    paramCharSequence = super.getTransformation(paramCharSequence, paramView);
    if (paramCharSequence != null) {
      return paramCharSequence.toString().toUpperCase(fQ);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */