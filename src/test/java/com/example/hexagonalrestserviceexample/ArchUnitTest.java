package com.example.hexagonalrestserviceexample;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.Architectures;

@AnalyzeClasses(packages = "com.example.hexagonalrestserviceexample",
        importOptions = ImportOption.DoNotIncludeTests.class)
public class ArchUnitTest {

    @ArchTest
    static final ArchRule isHexagonalArchitectureRespected =
            Architectures.layeredArchitecture()
                    .consideringOnlyDependenciesInLayers()
                    .withOptionalLayers(true)
                    .layer("domain").definedBy("..domain..")
                    .layer("endpoint.rest").definedBy("..endpoint.rest..")
                    .layer("endpoint.messaging").definedBy("..endpoint.messaging..")
                    .layer("provider.rest").definedBy("..provider.rest..")
                    .layer("provider.messaging").definedBy("..provider.messaging..")
                    .layer("provider.persistence").definedBy("..provider.persistence..")
                    .whereLayer("domain").mayNotAccessAnyLayer()
                    .whereLayer("endpoint.rest").mayOnlyAccessLayers("domain")
                    .whereLayer("endpoint.messaging").mayOnlyAccessLayers("domain")
                    .whereLayer("provider.rest").mayOnlyAccessLayers("domain")
                    .whereLayer("provider.messaging").mayOnlyAccessLayers("domain")
                    .whereLayer("provider.persistence").mayOnlyAccessLayers("domain");

}
