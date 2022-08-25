CREATE TABLE domain_object
(
    domain_object_id      uuid      NOT NULL,
    created_at            timestamp NOT NULL,
    updated_at            timestamp NOT NULL,
    mandatory_dummy_field varchar   NOT NULL,
    optional_dummy_field  varchar NULL,
    CONSTRAINT domain_object_pkey PRIMARY KEY (domain_object_id)
);