
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_11;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.linkedin.avro.fastserde.FastDeserializer;
import com.linkedin.avro.fastserde.customized.DatumReaderCustomization;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericArray;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Decoder;
import org.apache.avro.util.Utf8;

public class FastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField_GenericDeserializer_1602399407_1602399407
    implements FastDeserializer<IndexedRecord>
{

    private final Schema readerSchema;
    private final Schema recordsArray0;
    private final Schema recordsArrayArrayElemSchema0;
    private final Schema subField0;
    private final Schema recordsMap0;
    private final Schema recordsArrayUnion0;
    private final Schema recordsArrayUnionOptionSchema0;
    private final Schema recordsArrayUnionOptionArrayElemSchema0;
    private final Schema recordsMapUnion0;
    private final Schema recordsMapUnionOptionSchema0;
    private final Schema recordsMapUnionOptionMapValueSchema0;

    public FastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField_GenericDeserializer_1602399407_1602399407(Schema readerSchema) {
        this.readerSchema = readerSchema;
        this.recordsArray0 = readerSchema.getField("recordsArray").schema();
        this.recordsArrayArrayElemSchema0 = recordsArray0 .getElementType();
        this.subField0 = recordsArrayArrayElemSchema0 .getField("subField").schema();
        this.recordsMap0 = readerSchema.getField("recordsMap").schema();
        this.recordsArrayUnion0 = readerSchema.getField("recordsArrayUnion").schema();
        this.recordsArrayUnionOptionSchema0 = recordsArrayUnion0 .getTypes().get(1);
        this.recordsArrayUnionOptionArrayElemSchema0 = recordsArrayUnionOptionSchema0 .getElementType();
        this.recordsMapUnion0 = readerSchema.getField("recordsMapUnion").schema();
        this.recordsMapUnionOptionSchema0 = recordsMapUnion0 .getTypes().get(1);
        this.recordsMapUnionOptionMapValueSchema0 = recordsMapUnionOptionSchema0 .getValueType();
    }

    public IndexedRecord deserialize(IndexedRecord reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        return deserializeFastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0((reuse), (decoder), (customization));
    }

    public IndexedRecord deserializeFastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0(Object reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        IndexedRecord fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == readerSchema)) {
            fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 = ((IndexedRecord)(reuse));
        } else {
            fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 = new org.apache.avro.generic.GenericData.Record(readerSchema);
        }
        List<IndexedRecord> recordsArray1 = null;
        long chunkLen0 = (decoder.readArrayStart());
        Object oldArray0 = fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .get(0);
        if (oldArray0 instanceof List) {
            recordsArray1 = ((List) oldArray0);
            if (recordsArray1 instanceof GenericArray) {
                ((GenericArray) recordsArray1).reset();
            } else {
                recordsArray1 .clear();
            }
        } else {
            recordsArray1 = new org.apache.avro.generic.GenericData.Array<IndexedRecord>(((int) chunkLen0), recordsArray0);
        }
        while (chunkLen0 > 0) {
            for (int counter0 = 0; (counter0 <chunkLen0); counter0 ++) {
                Object recordsArrayArrayElementReuseVar0 = null;
                if (oldArray0 instanceof GenericArray) {
                    recordsArrayArrayElementReuseVar0 = ((GenericArray) oldArray0).peek();
                }
                recordsArray1 .add(deserializesubRecord0(recordsArrayArrayElementReuseVar0, (decoder), (customization)));
            }
            chunkLen0 = (decoder.arrayNext());
        }
        fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .put(0, recordsArray1);
        populate_FastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0((fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0), (customization), (decoder));
        populate_FastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField1((fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0), (customization), (decoder));
        return fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0;
    }

    public IndexedRecord deserializesubRecord0(Object reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        IndexedRecord subRecord0;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == recordsArrayArrayElemSchema0)) {
            subRecord0 = ((IndexedRecord)(reuse));
        } else {
            subRecord0 = new org.apache.avro.generic.GenericData.Record(recordsArrayArrayElemSchema0);
        }
        int unionIndex0 = (decoder.readIndex());
        if (unionIndex0 == 0) {
            decoder.readNull();
            subRecord0 .put(0, null);
        } else {
            if (unionIndex0 == 1) {
                Utf8 charSequence0;
                Object oldString0 = subRecord0 .get(0);
                if (oldString0 instanceof Utf8) {
                    charSequence0 = (decoder).readString(((Utf8) oldString0));
                } else {
                    charSequence0 = (decoder).readString(null);
                }
                subRecord0 .put(0, charSequence0);
            } else {
                throw new RuntimeException(("Illegal union index for 'subField': "+ unionIndex0));
            }
        }
        return subRecord0;
    }

    private void populate_FastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0(IndexedRecord fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0, DatumReaderCustomization customization, Decoder decoder)
        throws IOException
    {
        Map<Utf8, IndexedRecord> recordsMap1 = null;
        long chunkLen1 = (decoder.readMapStart());
        if (chunkLen1 > 0) {
            recordsMap1 = ((Map)(customization).getNewMapOverrideFunc().apply(fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .get(1), ((int) chunkLen1)));
            do {
                for (int counter1 = 0; (counter1 <chunkLen1); counter1 ++) {
                    Utf8 key0 = (decoder.readString(null));
                    recordsMap1 .put(key0, deserializesubRecord0(null, (decoder), (customization)));
                }
                chunkLen1 = (decoder.mapNext());
            } while (chunkLen1 > 0);
        } else {
            recordsMap1 = ((Map)(customization).getNewMapOverrideFunc().apply(fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .get(1), 0));
        }
        fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .put(1, recordsMap1);
        int unionIndex1 = (decoder.readIndex());
        if (unionIndex1 == 0) {
            decoder.readNull();
            fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .put(2, null);
        } else {
            if (unionIndex1 == 1) {
                List<IndexedRecord> recordsArrayUnionOption0 = null;
                long chunkLen2 = (decoder.readArrayStart());
                Object oldArray1 = fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .get(2);
                if (oldArray1 instanceof List) {
                    recordsArrayUnionOption0 = ((List) oldArray1);
                    if (recordsArrayUnionOption0 instanceof GenericArray) {
                        ((GenericArray) recordsArrayUnionOption0).reset();
                    } else {
                        recordsArrayUnionOption0 .clear();
                    }
                } else {
                    recordsArrayUnionOption0 = new org.apache.avro.generic.GenericData.Array<IndexedRecord>(((int) chunkLen2), recordsArrayUnionOptionSchema0);
                }
                while (chunkLen2 > 0) {
                    for (int counter2 = 0; (counter2 <chunkLen2); counter2 ++) {
                        Object recordsArrayUnionOptionArrayElementReuseVar0 = null;
                        if (oldArray1 instanceof GenericArray) {
                            recordsArrayUnionOptionArrayElementReuseVar0 = ((GenericArray) oldArray1).peek();
                        }
                        int unionIndex2 = (decoder.readIndex());
                        if (unionIndex2 == 0) {
                            decoder.readNull();
                            recordsArrayUnionOption0 .add(null);
                        } else {
                            if (unionIndex2 == 1) {
                                recordsArrayUnionOption0 .add(deserializesubRecord0(recordsArrayUnionOptionArrayElementReuseVar0, (decoder), (customization)));
                            } else {
                                throw new RuntimeException(("Illegal union index for 'recordsArrayUnionOptionElem': "+ unionIndex2));
                            }
                        }
                    }
                    chunkLen2 = (decoder.arrayNext());
                }
                fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .put(2, recordsArrayUnionOption0);
            } else {
                throw new RuntimeException(("Illegal union index for 'recordsArrayUnion': "+ unionIndex1));
            }
        }
    }

    private void populate_FastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField1(IndexedRecord fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0, DatumReaderCustomization customization, Decoder decoder)
        throws IOException
    {
        int unionIndex3 = (decoder.readIndex());
        if (unionIndex3 == 0) {
            decoder.readNull();
            fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .put(3, null);
        } else {
            if (unionIndex3 == 1) {
                Map<Utf8, IndexedRecord> recordsMapUnionOption0 = null;
                long chunkLen3 = (decoder.readMapStart());
                if (chunkLen3 > 0) {
                    recordsMapUnionOption0 = ((Map)(customization).getNewMapOverrideFunc().apply(fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .get(3), ((int) chunkLen3)));
                    do {
                        for (int counter3 = 0; (counter3 <chunkLen3); counter3 ++) {
                            Utf8 key1 = (decoder.readString(null));
                            int unionIndex4 = (decoder.readIndex());
                            if (unionIndex4 == 0) {
                                decoder.readNull();
                                recordsMapUnionOption0 .put(key1, null);
                            } else {
                                if (unionIndex4 == 1) {
                                    recordsMapUnionOption0 .put(key1, deserializesubRecord0(null, (decoder), (customization)));
                                } else {
                                    throw new RuntimeException(("Illegal union index for 'recordsMapUnionOptionValue': "+ unionIndex4));
                                }
                            }
                        }
                        chunkLen3 = (decoder.mapNext());
                    } while (chunkLen3 > 0);
                } else {
                    recordsMapUnionOption0 = ((Map)(customization).getNewMapOverrideFunc().apply(fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .get(3), 0));
                }
                fastGenericDeserializerGeneratorTest_shouldReadSubRecordCollectionsField0 .put(3, recordsMapUnionOption0);
            } else {
                throw new RuntimeException(("Illegal union index for 'recordsMapUnion': "+ unionIndex3));
            }
        }
    }

}
