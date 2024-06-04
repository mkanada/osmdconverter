package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserListener;

public interface OsmdConverterTSListener extends TypeScriptParserListener {
    void setFileName(String fileName);
}
