package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base class for all radar series.<br/>
Base class defines common methods, such as those for:
<ul>
  <li>Binding series to a scale: <i>xScale, yScale</i></li>
  <li>Base color settings: <i>color</i></li>
</ul>
You can also obtain <i>getIterator, getResetIterator</i> iterators here
 */
public class RadarSeriesTimeline extends SeriesBase {

    public RadarSeriesTimeline() {
        js.setLength(0);
        js.append("var radarSeriesTimeline").append(++variableIndex).append(" = anychart.core.radar.series.base();");
        jsBase = "radarSeriesTimeline" + variableIndex;
    }

    protected RadarSeriesTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected RadarSeriesTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number indexes;
    private Number[] indexes1;

    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Number indexes) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes = indexes;
        } else {
            this.indexes = indexes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".excludePoint(%f);", indexes));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%f);", indexes));
                js.setLength(0);
            }
        }
    }


    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Number[] indexes1) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes1 = indexes1;
        } else {
            this.indexes1 = indexes1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));
                js.setLength(0);
            }
        }
    }

    private Number indexes2;
    private Number[] indexes3;

    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Number indexes2) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes2 = indexes2;
        } else {
            this.indexes2 = indexes2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".includePoint(%f);", indexes2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%f);", indexes2));
                js.setLength(0);
            }
        }
    }


    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Number[] indexes3) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes3 = indexes3;
        } else {
            this.indexes3 = indexes3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));
                js.setLength(0);
            }
        }
    }

    private Number indexes4;
    private Number[] indexes5;

    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Number indexes4) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes4 = indexes4;
        } else {
            this.indexes4 = indexes4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".keepOnlyPoints(%f);", indexes4));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f);", indexes4));
                js.setLength(0);
            }
        }
    }


    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Number[] indexes5) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes5 = indexes5;
        } else {
            this.indexes5 = indexes5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));
                js.setLength(0);
            }
        }
    }

    private Number xSubRangeRatio;

    /**
     * Transforms values to pixel coordinates.
     */
    public void transformXY(Number xSubRangeRatio) {
        if (jsBase == null) {
            this.xSubRangeRatio = xSubRangeRatio;
        } else {
            this.xSubRangeRatio = xSubRangeRatio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".transformXY(%f);", xSubRangeRatio));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transformXY(%f);", xSubRangeRatio));
                js.setLength(0);
            }
        }
    }

    private Ordinal getXScale;

    /**
     * Getter for the series X scale.
     */
    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }

    private ScalesTimeline xScale;
    private String xScale1;
    private ScaleTypes xScale2;
    private String xScale3;
    private List<ScalesTimeline> setXScale = new ArrayList<>();

    /**
     * Setter for the series X scale.
     */
    public ScalesTimeline setXScale(ScalesTimeline xScale) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            
            this.xScale = xScale;
        } else {
            this.xScale = xScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(xScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale != null) ? xScale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", ((xScale != null) ? xScale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale" + variableIndex);
        setXScale.add(item);
        return item;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setXScale1 = new ArrayList<>();

    /**
     * Setter for the series X scale.
     */
    public ScalesTimeline setXScale(String xScale1) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            
            this.xScale1 = xScale1;
        } else {
            this.xScale1 = xScale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setXScale1" + ++variableIndex + " = " + jsBase + ".xScale(%s);", wrapQuotes(xScale1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", wrapQuotes(xScale1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale1" + variableIndex);
        setXScale1.add(item);
        return item;
    }
    private String generateJSsetXScale1() {
        if (!setXScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setXScale2 = new ArrayList<>();

    /**
     * Setter for the series X scale.
     */
    public ScalesTimeline setXScale(ScaleTypes xScale2) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            
            this.xScale2 = xScale2;
        } else {
            this.xScale2 = xScale2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setXScale2" + ++variableIndex + " = " + jsBase + ".xScale(%s);", ((xScale2 != null) ? xScale2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", ((xScale2 != null) ? xScale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale2" + variableIndex);
        setXScale2.add(item);
        return item;
    }
    private String generateJSsetXScale2() {
        if (!setXScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScalesTimeline getYScale;

    /**
     * Getter for the series Y scale.
     */
    public ScalesTimeline getYScale() {
        if (getYScale == null)
            getYScale = new ScalesTimeline(jsBase + ".yScale()");

        return getYScale;
    }

    private ScalesTimeline yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;
    private List<ScalesTimeline> setYScale = new ArrayList<>();

    /**
     * Setter for the series Y scale.
     */
    public ScalesTimeline setYScale(ScalesTimeline yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(yScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale != null) ? yScale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale != null) ? yScale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setYScale" + variableIndex);
        setYScale.add(item);
        return item;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setYScale1 = new ArrayList<>();

    /**
     * Setter for the series Y scale.
     */
    public ScalesTimeline setYScale(String yScale1) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale1 = yScale1;
        } else {
            this.yScale1 = yScale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setYScale1" + ++variableIndex + " = " + jsBase + ".yScale(%s);", wrapQuotes(yScale1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(yScale1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setYScale1" + variableIndex);
        setYScale1.add(item);
        return item;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setYScale2 = new ArrayList<>();

    /**
     * Setter for the series Y scale.
     */
    public ScalesTimeline setYScale(ScaleTypes yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setYScale2" + ++variableIndex + " = " + jsBase + ".yScale(%s);", ((yScale2 != null) ? yScale2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale2 != null) ? yScale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setYScale2" + variableIndex);
        setYScale2.add(item);
        return item;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setYScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }

    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetXScale());
        jsGetters.append(generateJSgetYScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetXScale());
        js.append(generateJSsetXScale1());
        js.append(generateJSsetXScale2());
        js.append(generateJSsetYScale());
        js.append(generateJSsetYScale1());
        js.append(generateJSsetYScale2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}