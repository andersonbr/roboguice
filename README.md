roboguice
=========

Roboguice

Projeto inicial com roboguice by Anderson Calixto

Necessário plugins no eclipse:
  m2e
  m2e-android


Archetype:

mvn archetype:generate \
  -DarchetypeArtifactId=android-quickstart \
  -DarchetypeGroupId=de.akquinet.android.archetypes \
  -DarchetypeVersion=1.0.10 \
  -Dplatform=16 \
  -DgroupId=br.com.andersoncalixto \
  -DartifactId=vicinity \
  -Demulator=422intel
