//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2025.05.23 alle 09:10:06 AM CEST 
//


package oecd.ties.stf.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CountryCodeExMS_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryCodeExMS_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AF"/&gt;
 *     &lt;enumeration value="AX"/&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="DZ"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="AO"/&gt;
 *     &lt;enumeration value="AI"/&gt;
 *     &lt;enumeration value="AQ"/&gt;
 *     &lt;enumeration value="AG"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AW"/&gt;
 *     &lt;enumeration value="AU"/&gt;
 *     &lt;enumeration value="AZ"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="BH"/&gt;
 *     &lt;enumeration value="BD"/&gt;
 *     &lt;enumeration value="BB"/&gt;
 *     &lt;enumeration value="BY"/&gt;
 *     &lt;enumeration value="BZ"/&gt;
 *     &lt;enumeration value="BJ"/&gt;
 *     &lt;enumeration value="BM"/&gt;
 *     &lt;enumeration value="BT"/&gt;
 *     &lt;enumeration value="BO"/&gt;
 *     &lt;enumeration value="BA"/&gt;
 *     &lt;enumeration value="BW"/&gt;
 *     &lt;enumeration value="BV"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="IO"/&gt;
 *     &lt;enumeration value="BN"/&gt;
 *     &lt;enumeration value="BF"/&gt;
 *     &lt;enumeration value="BI"/&gt;
 *     &lt;enumeration value="KH"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="KY"/&gt;
 *     &lt;enumeration value="CF"/&gt;
 *     &lt;enumeration value="TD"/&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="CN"/&gt;
 *     &lt;enumeration value="CX"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="KM"/&gt;
 *     &lt;enumeration value="CG"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="CK"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="CI"/&gt;
 *     &lt;enumeration value="CU"/&gt;
 *     &lt;enumeration value="DJ"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="DO"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="EG"/&gt;
 *     &lt;enumeration value="SV"/&gt;
 *     &lt;enumeration value="GQ"/&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="FK"/&gt;
 *     &lt;enumeration value="FO"/&gt;
 *     &lt;enumeration value="FJ"/&gt;
 *     &lt;enumeration value="GF"/&gt;
 *     &lt;enumeration value="PF"/&gt;
 *     &lt;enumeration value="TF"/&gt;
 *     &lt;enumeration value="GA"/&gt;
 *     &lt;enumeration value="GM"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="GH"/&gt;
 *     &lt;enumeration value="GI"/&gt;
 *     &lt;enumeration value="GL"/&gt;
 *     &lt;enumeration value="GD"/&gt;
 *     &lt;enumeration value="GP"/&gt;
 *     &lt;enumeration value="GU"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GG"/&gt;
 *     &lt;enumeration value="GN"/&gt;
 *     &lt;enumeration value="GW"/&gt;
 *     &lt;enumeration value="GY"/&gt;
 *     &lt;enumeration value="HT"/&gt;
 *     &lt;enumeration value="HM"/&gt;
 *     &lt;enumeration value="VA"/&gt;
 *     &lt;enumeration value="HN"/&gt;
 *     &lt;enumeration value="HK"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="IR"/&gt;
 *     &lt;enumeration value="IQ"/&gt;
 *     &lt;enumeration value="IL"/&gt;
 *     &lt;enumeration value="JM"/&gt;
 *     &lt;enumeration value="JP"/&gt;
 *     &lt;enumeration value="JE"/&gt;
 *     &lt;enumeration value="JO"/&gt;
 *     &lt;enumeration value="KZ"/&gt;
 *     &lt;enumeration value="KE"/&gt;
 *     &lt;enumeration value="KI"/&gt;
 *     &lt;enumeration value="KP"/&gt;
 *     &lt;enumeration value="KR"/&gt;
 *     &lt;enumeration value="KW"/&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="LR"/&gt;
 *     &lt;enumeration value="LY"/&gt;
 *     &lt;enumeration value="LI"/&gt;
 *     &lt;enumeration value="MO"/&gt;
 *     &lt;enumeration value="MK"/&gt;
 *     &lt;enumeration value="MG"/&gt;
 *     &lt;enumeration value="MW"/&gt;
 *     &lt;enumeration value="MY"/&gt;
 *     &lt;enumeration value="MV"/&gt;
 *     &lt;enumeration value="ML"/&gt;
 *     &lt;enumeration value="MH"/&gt;
 *     &lt;enumeration value="MQ"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MU"/&gt;
 *     &lt;enumeration value="YT"/&gt;
 *     &lt;enumeration value="MX"/&gt;
 *     &lt;enumeration value="FM"/&gt;
 *     &lt;enumeration value="MD"/&gt;
 *     &lt;enumeration value="MN"/&gt;
 *     &lt;enumeration value="ME"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="MA"/&gt;
 *     &lt;enumeration value="MZ"/&gt;
 *     &lt;enumeration value="MM"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NR"/&gt;
 *     &lt;enumeration value="NP"/&gt;
 *     &lt;enumeration value="NC"/&gt;
 *     &lt;enumeration value="NZ"/&gt;
 *     &lt;enumeration value="NI"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NG"/&gt;
 *     &lt;enumeration value="NU"/&gt;
 *     &lt;enumeration value="NF"/&gt;
 *     &lt;enumeration value="MP"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="OM"/&gt;
 *     &lt;enumeration value="PK"/&gt;
 *     &lt;enumeration value="PW"/&gt;
 *     &lt;enumeration value="PS"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PG"/&gt;
 *     &lt;enumeration value="PY"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="PH"/&gt;
 *     &lt;enumeration value="PN"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="QA"/&gt;
 *     &lt;enumeration value="RE"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="BL"/&gt;
 *     &lt;enumeration value="SH"/&gt;
 *     &lt;enumeration value="KN"/&gt;
 *     &lt;enumeration value="LC"/&gt;
 *     &lt;enumeration value="MF"/&gt;
 *     &lt;enumeration value="PM"/&gt;
 *     &lt;enumeration value="VC"/&gt;
 *     &lt;enumeration value="WS"/&gt;
 *     &lt;enumeration value="SM"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SN"/&gt;
 *     &lt;enumeration value="RS"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SG"/&gt;
 *     &lt;enumeration value="SX"/&gt;
 *     &lt;enumeration value="SB"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="ZA"/&gt;
 *     &lt;enumeration value="GS"/&gt;
 *     &lt;enumeration value="SS"/&gt;
 *     &lt;enumeration value="LK"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="SJ"/&gt;
 *     &lt;enumeration value="SZ"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="SY"/&gt;
 *     &lt;enumeration value="TW"/&gt;
 *     &lt;enumeration value="TJ"/&gt;
 *     &lt;enumeration value="TZ"/&gt;
 *     &lt;enumeration value="TH"/&gt;
 *     &lt;enumeration value="TL"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TK"/&gt;
 *     &lt;enumeration value="TO"/&gt;
 *     &lt;enumeration value="TT"/&gt;
 *     &lt;enumeration value="TN"/&gt;
 *     &lt;enumeration value="TR"/&gt;
 *     &lt;enumeration value="TM"/&gt;
 *     &lt;enumeration value="TC"/&gt;
 *     &lt;enumeration value="TV"/&gt;
 *     &lt;enumeration value="UG"/&gt;
 *     &lt;enumeration value="UA"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="UM"/&gt;
 *     &lt;enumeration value="UY"/&gt;
 *     &lt;enumeration value="UZ"/&gt;
 *     &lt;enumeration value="VU"/&gt;
 *     &lt;enumeration value="VE"/&gt;
 *     &lt;enumeration value="VN"/&gt;
 *     &lt;enumeration value="VG"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="WF"/&gt;
 *     &lt;enumeration value="EH"/&gt;
 *     &lt;enumeration value="YE"/&gt;
 *     &lt;enumeration value="ZM"/&gt;
 *     &lt;enumeration value="ZW"/&gt;
 *     &lt;enumeration value="CW"/&gt;
 *     &lt;enumeration value="NM"/&gt;
 *     &lt;enumeration value="BQ"/&gt;
 *     &lt;enumeration value="IC"/&gt;
 *     &lt;enumeration value="XI"/&gt;
 *     &lt;enumeration value="XJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryCodeExMS_Type")
@XmlEnum
public enum CountryCodeExMSType {

    AF,
    AX,
    AL,
    DZ,
    AS,
    AD,
    AO,
    AI,
    AQ,
    AG,
    AR,
    AM,
    AW,
    AU,
    AZ,
    BS,
    BH,
    BD,
    BB,
    BY,
    BZ,
    BJ,
    BM,
    BT,
    BO,
    BA,
    BW,
    BV,
    BR,
    IO,
    BN,
    BF,
    BI,
    KH,
    CM,
    CA,
    CV,
    KY,
    CF,
    TD,
    CL,
    CN,
    CX,
    CC,
    CO,
    KM,
    CG,
    CD,
    CK,
    CR,
    CI,
    CU,
    DJ,
    DM,
    DO,
    EC,
    EG,
    SV,
    GQ,
    ER,
    ET,
    FK,
    FO,
    FJ,
    GF,
    PF,
    TF,
    GA,
    GM,
    GE,
    GH,
    GI,
    GL,
    GD,
    GP,
    GU,
    GT,
    GG,
    GN,
    GW,
    GY,
    HT,
    HM,
    VA,
    HN,
    HK,
    IS,
    IN,
    ID,
    IR,
    IQ,
    IL,
    JM,
    JP,
    JE,
    JO,
    KZ,
    KE,
    KI,
    KP,
    KR,
    KW,
    KG,
    LA,
    LB,
    LS,
    LR,
    LY,
    LI,
    MO,
    MK,
    MG,
    MW,
    MY,
    MV,
    ML,
    MH,
    MQ,
    MR,
    MU,
    YT,
    MX,
    FM,
    MD,
    MN,
    ME,
    MS,
    MA,
    MZ,
    MM,
    NA,
    NR,
    NP,
    NC,
    NZ,
    NI,
    NE,
    NG,
    NU,
    NF,
    MP,
    NO,
    OM,
    PK,
    PW,
    PS,
    PA,
    PG,
    PY,
    PE,
    PH,
    PN,
    PR,
    QA,
    RE,
    RU,
    RW,
    BL,
    SH,
    KN,
    LC,
    MF,
    PM,
    VC,
    WS,
    SM,
    ST,
    SA,
    SN,
    RS,
    SC,
    SL,
    SG,
    SX,
    SB,
    SO,
    ZA,
    GS,
    SS,
    LK,
    SD,
    SR,
    SJ,
    SZ,
    CH,
    SY,
    TW,
    TJ,
    TZ,
    TH,
    TL,
    TG,
    TK,
    TO,
    TT,
    TN,
    TR,
    TM,
    TC,
    TV,
    UG,
    UA,
    AE,
    US,
    UM,
    UY,
    UZ,
    VU,
    VE,
    VN,
    VG,
    VI,
    WF,
    EH,
    YE,
    ZM,
    ZW,
    CW,
    NM,
    BQ,
    IC,
    XI,
    XJ;

    public String value() {
        return name();
    }

    public static CountryCodeExMSType fromValue(String v) {
        return valueOf(v);
    }

}
