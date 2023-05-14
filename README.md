# Base64 Encoding and Decoding Program

Në këtë projekt kemi realizuar një program që mundëson enkodimin dhe dekodimin sipas Base64. Ky program u realizua nga Jeta Syla, Suhejla Hoxha, Tringa Baftiu dhe Valtrina Cacaj 
në kuadër të lëndës Siguria e të Dhënave.

## Teknologjitë e përdorura

- Java: Gjuha e programimit e përdorur për të zhvilluar aplikacionin.
- JavaFX: Korniza GUI e përdorur për krijimin e ndërfaqes së përdoruesit

## Karakteristikat

- **Encode:** Konverton tekst të thjeshtë ose të dhëna binare në formatin e koduar Base64.
- **Dekodimi:** Konverton të dhënat e koduara Base64 në formën e tyre origjinale.


### Si funksionon Base64?

Fillimisht fjalën ose tekstin që dëshirojmë t'a enkodojmë e marrim paraqitjen binare të karaktereve ASCII të tekstit të dhënë. Kjo realizohet me ndihmën e tabelës së konvertimit ASCII-në-binar.
ASCII përdor 8 bita për të përfaqësuar një karakter, përderisa Base64 përdor 6 bita për një karakter. Për këtë arsye tekstin e konvertuar nga ASCII në binar e ndajmë në blloqe 6 bitëshe.
Së fundi, këto vlera 6-bit mund të konvertohen në karakterin e duhur duke përdorur një tabelë Base64, ku në këtë tabelë cdo bllok 6 bitësh reprezanton një karakter të caktuar.
Meqënëse Base64 përdor sekuenca 24-bitëshe, padding-u (mbushja) është e nevojshme kur teksti në binar nuk mund të ndahet në një sekuencë 24-bitëshe, shenja që vendoset kur kemi padding është (=).
Padding-u hiqet nga skema e kodimit Base64 kur të dhënat dekodohen, pra nuk merren parasysh.

