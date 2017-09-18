/**
 * FileType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FileType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FileType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _PDF = "PDF";
    public static final java.lang.String _POWER_POINT = "POWER_POINT";
    public static final java.lang.String _POWER_POINT_X = "POWER_POINT_X";
    public static final java.lang.String _POWER_POINT_M = "POWER_POINT_M";
    public static final java.lang.String _POWER_POINT_T = "POWER_POINT_T";
    public static final java.lang.String _WORD = "WORD";
    public static final java.lang.String _WORD_X = "WORD_X";
    public static final java.lang.String _WORD_M = "WORD_M";
    public static final java.lang.String _WORD_T = "WORD_T";
    public static final java.lang.String _PPS = "PPS";
    public static final java.lang.String _PPSX = "PPSX";
    public static final java.lang.String _EXCEL = "EXCEL";
    public static final java.lang.String _EXCEL_X = "EXCEL_X";
    public static final java.lang.String _EXCEL_M = "EXCEL_M";
    public static final java.lang.String _EXCEL_T = "EXCEL_T";
    public static final java.lang.String _GOOGLE_DOCUMENT = "GOOGLE_DOCUMENT";
    public static final java.lang.String _GOOGLE_PRESENTATION = "GOOGLE_PRESENTATION";
    public static final java.lang.String _GOOGLE_SPREADSHEET = "GOOGLE_SPREADSHEET";
    public static final java.lang.String _GOOGLE_DRAWING = "GOOGLE_DRAWING";
    public static final java.lang.String _GOOGLE_FORM = "GOOGLE_FORM";
    public static final java.lang.String _GOOGLE_SCRIPT = "GOOGLE_SCRIPT";
    public static final java.lang.String _LINK = "LINK";
    public static final java.lang.String _SLIDE = "SLIDE";
    public static final java.lang.String _AAC = "AAC";
    public static final java.lang.String _ACGI = "ACGI";
    public static final java.lang.String _AI = "AI";
    public static final java.lang.String _AVI = "AVI";
    public static final java.lang.String _BMP = "BMP";
    public static final java.lang.String _BOXNOTE = "BOXNOTE";
    public static final java.lang.String _CSV = "CSV";
    public static final java.lang.String _EPS = "EPS";
    public static final java.lang.String _EXE = "EXE";
    public static final java.lang.String _FLASH = "FLASH";
    public static final java.lang.String _GIF = "GIF";
    public static final java.lang.String _GZIP = "GZIP";
    public static final java.lang.String _HTM = "HTM";
    public static final java.lang.String _HTML = "HTML";
    public static final java.lang.String _HTX = "HTX";
    public static final java.lang.String _JPEG = "JPEG";
    public static final java.lang.String _JPE = "JPE";
    public static final java.lang.String _PJP = "PJP";
    public static final java.lang.String _PJPEG = "PJPEG";
    public static final java.lang.String _JFIF = "JFIF";
    public static final java.lang.String _JPG = "JPG";
    public static final java.lang.String _JS = "JS";
    public static final java.lang.String _MHTM = "MHTM";
    public static final java.lang.String _MHTML = "MHTML";
    public static final java.lang.String _MP3 = "MP3";
    public static final java.lang.String _M4A = "M4A";
    public static final java.lang.String _M4V = "M4V";
    public static final java.lang.String _MP4 = "MP4";
    public static final java.lang.String _MPEG = "MPEG";
    public static final java.lang.String _MPG = "MPG";
    public static final java.lang.String _MOV = "MOV";
    public static final java.lang.String _ODP = "ODP";
    public static final java.lang.String _ODS = "ODS";
    public static final java.lang.String _ODT = "ODT";
    public static final java.lang.String _OGV = "OGV";
    public static final java.lang.String _PNG = "PNG";
    public static final java.lang.String _PSD = "PSD";
    public static final java.lang.String _RTF = "RTF";
    public static final java.lang.String _SHTM = "SHTM";
    public static final java.lang.String _SHTML = "SHTML";
    public static final java.lang.String _SNOTE = "SNOTE";
    public static final java.lang.String _STYPI = "STYPI";
    public static final java.lang.String _SVG = "SVG";
    public static final java.lang.String _SVGZ = "SVGZ";
    public static final java.lang.String _TEXT = "TEXT";
    public static final java.lang.String _THTML = "THTML";
    public static final java.lang.String _VISIO = "VISIO";
    public static final java.lang.String _WMV = "WMV";
    public static final java.lang.String _WRF = "WRF";
    public static final java.lang.String _XML = "XML";
    public static final java.lang.String _ZIP = "ZIP";
    public static final java.lang.String _XZIP = "XZIP";
    public static final java.lang.String _WMA = "WMA";
    public static final java.lang.String _XSN = "XSN";
    public static final java.lang.String _TRTF = "TRTF";
    public static final java.lang.String _TXML = "TXML";
    public static final java.lang.String _WEBVIEW = "WEBVIEW";
    public static final java.lang.String _RFC822 = "RFC822";
    public static final java.lang.String _ASF = "ASF";
    public static final java.lang.String _DWG = "DWG";
    public static final java.lang.String _JAR = "JAR";
    public static final java.lang.String _XJS = "XJS";
    public static final java.lang.String _OPX = "OPX";
    public static final java.lang.String _XPSD = "XPSD";
    public static final java.lang.String _TIF = "TIF";
    public static final java.lang.String _TIFF = "TIFF";
    public static final java.lang.String _WAV = "WAV";
    public static final java.lang.String _CSS = "CSS";
    public static final java.lang.String _THUMB720BY480 = "THUMB720BY480";
    public static final java.lang.String _THUMB240BY180 = "THUMB240BY180";
    public static final java.lang.String _THUMB120BY90 = "THUMB120BY90";
    public static final java.lang.String _ALLTHUMBS = "ALLTHUMBS";
    public static final java.lang.String _PAGED_FLASH = "PAGED_FLASH";
    public static final java.lang.String _PACK = "PACK";
    public static final java.lang.String _C = "C";
    public static final java.lang.String _CPP = "CPP";
    public static final java.lang.String _WORDT = "WORDT";
    public static final java.lang.String _INI = "INI";
    public static final java.lang.String _JAVA = "JAVA";
    public static final java.lang.String _LOG = "LOG";
    public static final java.lang.String _POWER_POINTT = "POWER_POINTT";
    public static final java.lang.String _SQL = "SQL";
    public static final java.lang.String _XHTML = "XHTML";
    public static final java.lang.String _EXCELT = "EXCELT";
    public static final FileType UNKNOWN = new FileType(_UNKNOWN);
    public static final FileType PDF = new FileType(_PDF);
    public static final FileType POWER_POINT = new FileType(_POWER_POINT);
    public static final FileType POWER_POINT_X = new FileType(_POWER_POINT_X);
    public static final FileType POWER_POINT_M = new FileType(_POWER_POINT_M);
    public static final FileType POWER_POINT_T = new FileType(_POWER_POINT_T);
    public static final FileType WORD = new FileType(_WORD);
    public static final FileType WORD_X = new FileType(_WORD_X);
    public static final FileType WORD_M = new FileType(_WORD_M);
    public static final FileType WORD_T = new FileType(_WORD_T);
    public static final FileType PPS = new FileType(_PPS);
    public static final FileType PPSX = new FileType(_PPSX);
    public static final FileType EXCEL = new FileType(_EXCEL);
    public static final FileType EXCEL_X = new FileType(_EXCEL_X);
    public static final FileType EXCEL_M = new FileType(_EXCEL_M);
    public static final FileType EXCEL_T = new FileType(_EXCEL_T);
    public static final FileType GOOGLE_DOCUMENT = new FileType(_GOOGLE_DOCUMENT);
    public static final FileType GOOGLE_PRESENTATION = new FileType(_GOOGLE_PRESENTATION);
    public static final FileType GOOGLE_SPREADSHEET = new FileType(_GOOGLE_SPREADSHEET);
    public static final FileType GOOGLE_DRAWING = new FileType(_GOOGLE_DRAWING);
    public static final FileType GOOGLE_FORM = new FileType(_GOOGLE_FORM);
    public static final FileType GOOGLE_SCRIPT = new FileType(_GOOGLE_SCRIPT);
    public static final FileType LINK = new FileType(_LINK);
    public static final FileType SLIDE = new FileType(_SLIDE);
    public static final FileType AAC = new FileType(_AAC);
    public static final FileType ACGI = new FileType(_ACGI);
    public static final FileType AI = new FileType(_AI);
    public static final FileType AVI = new FileType(_AVI);
    public static final FileType BMP = new FileType(_BMP);
    public static final FileType BOXNOTE = new FileType(_BOXNOTE);
    public static final FileType CSV = new FileType(_CSV);
    public static final FileType EPS = new FileType(_EPS);
    public static final FileType EXE = new FileType(_EXE);
    public static final FileType FLASH = new FileType(_FLASH);
    public static final FileType GIF = new FileType(_GIF);
    public static final FileType GZIP = new FileType(_GZIP);
    public static final FileType HTM = new FileType(_HTM);
    public static final FileType HTML = new FileType(_HTML);
    public static final FileType HTX = new FileType(_HTX);
    public static final FileType JPEG = new FileType(_JPEG);
    public static final FileType JPE = new FileType(_JPE);
    public static final FileType PJP = new FileType(_PJP);
    public static final FileType PJPEG = new FileType(_PJPEG);
    public static final FileType JFIF = new FileType(_JFIF);
    public static final FileType JPG = new FileType(_JPG);
    public static final FileType JS = new FileType(_JS);
    public static final FileType MHTM = new FileType(_MHTM);
    public static final FileType MHTML = new FileType(_MHTML);
    public static final FileType MP3 = new FileType(_MP3);
    public static final FileType M4A = new FileType(_M4A);
    public static final FileType M4V = new FileType(_M4V);
    public static final FileType MP4 = new FileType(_MP4);
    public static final FileType MPEG = new FileType(_MPEG);
    public static final FileType MPG = new FileType(_MPG);
    public static final FileType MOV = new FileType(_MOV);
    public static final FileType ODP = new FileType(_ODP);
    public static final FileType ODS = new FileType(_ODS);
    public static final FileType ODT = new FileType(_ODT);
    public static final FileType OGV = new FileType(_OGV);
    public static final FileType PNG = new FileType(_PNG);
    public static final FileType PSD = new FileType(_PSD);
    public static final FileType RTF = new FileType(_RTF);
    public static final FileType SHTM = new FileType(_SHTM);
    public static final FileType SHTML = new FileType(_SHTML);
    public static final FileType SNOTE = new FileType(_SNOTE);
    public static final FileType STYPI = new FileType(_STYPI);
    public static final FileType SVG = new FileType(_SVG);
    public static final FileType SVGZ = new FileType(_SVGZ);
    public static final FileType TEXT = new FileType(_TEXT);
    public static final FileType THTML = new FileType(_THTML);
    public static final FileType VISIO = new FileType(_VISIO);
    public static final FileType WMV = new FileType(_WMV);
    public static final FileType WRF = new FileType(_WRF);
    public static final FileType XML = new FileType(_XML);
    public static final FileType ZIP = new FileType(_ZIP);
    public static final FileType XZIP = new FileType(_XZIP);
    public static final FileType WMA = new FileType(_WMA);
    public static final FileType XSN = new FileType(_XSN);
    public static final FileType TRTF = new FileType(_TRTF);
    public static final FileType TXML = new FileType(_TXML);
    public static final FileType WEBVIEW = new FileType(_WEBVIEW);
    public static final FileType RFC822 = new FileType(_RFC822);
    public static final FileType ASF = new FileType(_ASF);
    public static final FileType DWG = new FileType(_DWG);
    public static final FileType JAR = new FileType(_JAR);
    public static final FileType XJS = new FileType(_XJS);
    public static final FileType OPX = new FileType(_OPX);
    public static final FileType XPSD = new FileType(_XPSD);
    public static final FileType TIF = new FileType(_TIF);
    public static final FileType TIFF = new FileType(_TIFF);
    public static final FileType WAV = new FileType(_WAV);
    public static final FileType CSS = new FileType(_CSS);
    public static final FileType THUMB720BY480 = new FileType(_THUMB720BY480);
    public static final FileType THUMB240BY180 = new FileType(_THUMB240BY180);
    public static final FileType THUMB120BY90 = new FileType(_THUMB120BY90);
    public static final FileType ALLTHUMBS = new FileType(_ALLTHUMBS);
    public static final FileType PAGED_FLASH = new FileType(_PAGED_FLASH);
    public static final FileType PACK = new FileType(_PACK);
    public static final FileType C = new FileType(_C);
    public static final FileType CPP = new FileType(_CPP);
    public static final FileType WORDT = new FileType(_WORDT);
    public static final FileType INI = new FileType(_INI);
    public static final FileType JAVA = new FileType(_JAVA);
    public static final FileType LOG = new FileType(_LOG);
    public static final FileType POWER_POINTT = new FileType(_POWER_POINTT);
    public static final FileType SQL = new FileType(_SQL);
    public static final FileType XHTML = new FileType(_XHTML);
    public static final FileType EXCELT = new FileType(_EXCELT);
    public java.lang.String getValue() { return _value_;}
    public static FileType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FileType enumeration = (FileType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FileType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FileType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
