
package com.linkedin.avro.fastserde.generated.deserialization.AVRO_1_11;

import java.io.IOException;
import java.util.Map;
import com.linkedin.avro.fastserde.FastDeserializer;
import com.linkedin.avro.fastserde.customized.DatumReaderCustomization;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Decoder;
import org.apache.avro.util.Utf8;

public class Map_of_UNION_GenericDeserializer_2140000109_2140000109
    implements FastDeserializer<Map<Utf8, IndexedRecord>>
{

    private final Schema readerSchema;
    private final Schema mapMapValueSchema0;
    private final Schema mapValueOptionSchema0;
    private final Schema field0;

    public Map_of_UNION_GenericDeserializer_2140000109_2140000109(Schema readerSchema) {
        this.readerSchema = readerSchema;
        this.mapMapValueSchema0 = readerSchema.getValueType();
        this.mapValueOptionSchema0 = mapMapValueSchema0 .getTypes().get(1);
        this.field0 = mapValueOptionSchema0 .getField("field").schema();
    }

    public Map<Utf8, IndexedRecord> deserialize(Map<Utf8, IndexedRecord> reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        Map<Utf8, IndexedRecord> map0 = null;
        long chunkLen0 = (decoder.readMapStart());
        if (chunkLen0 > 0) {
            map0 = ((Map)(customization).getNewMapOverrideFunc().apply((reuse), ((int) chunkLen0)));
            do {
                for (int counter0 = 0; (counter0 <chunkLen0); counter0 ++) {
                    Utf8 key0 = (decoder.readString(null));
                    int unionIndex0 = (decoder.readIndex());
                    if (unionIndex0 == 0) {
                        decoder.readNull();
                        map0 .put(key0, null);
                    } else {
                        if (unionIndex0 == 1) {
                            map0 .put(key0, deserializerecord0(null, (decoder), (customization)));
                        } else {
                            throw new RuntimeException(("Illegal union index for 'mapValue': "+ unionIndex0));
                        }
                    }
                }
                chunkLen0 = (decoder.mapNext());
            } while (chunkLen0 > 0);
        } else {
            map0 = ((Map)(customization).getNewMapOverrideFunc().apply((reuse), 0));
        }
        return map0;
    }

    public IndexedRecord deserializerecord0(Object reuse, Decoder decoder, DatumReaderCustomization customization)
        throws IOException
    {
        IndexedRecord record0;
        if ((((reuse)!= null)&&((reuse) instanceof IndexedRecord))&&(((IndexedRecord)(reuse)).getSchema() == mapValueOptionSchema0)) {
            record0 = ((IndexedRecord)(reuse));
        } else {
            record0 = new org.apache.avro.generic.GenericData.Record(mapValueOptionSchema0);
        }
        int unionIndex1 = (decoder.readIndex());
        if (unionIndex1 == 0) {
            decoder.readNull();
            record0 .put(0, null);
        } else {
            if (unionIndex1 == 1) {
                Utf8 charSequence0;
                Object oldString0 = record0 .get(0);
                if (oldString0 instanceof Utf8) {
                    charSequence0 = (decoder).readString(((Utf8) oldString0));
                } else {
                    charSequence0 = (decoder).readString(null);
                }
                record0 .put(0, charSequence0);
            } else {
                throw new RuntimeException(("Illegal union index for 'field': "+ unionIndex1));
            }
        }
        return record0;
    }

}
