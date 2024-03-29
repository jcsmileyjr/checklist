CREATE TABLE ADVICE(
  ADVICE_ID BIGSERIAL PRIMARY KEY,
  ADVICE VARCHAR(255),
  LIKES INT
);

CREATE TABLE CHECKLISTA(
  CHECKLIST_ID BIGSERIAL PRIMARY KEY,
  ITEM VARCHAR(255)
);

CREATE TABLE CHECKLISTB(
  CHECKLIST_ID BIGSERIAL PRIMARY KEY,
  ITEM VARCHAR(255)
);

CREATE INDEX IDX_ADVICE_ID_ ON ADVICE(ADVICE_ID);
CREATE INDEX IDX_CHECKLISTA_ID on CHECKLISTA(CHECKLIST_ID);
CREATE INDEX IDX_CHECKLISTB_ID on CHECKLISTB(CHECKLIST_ID);