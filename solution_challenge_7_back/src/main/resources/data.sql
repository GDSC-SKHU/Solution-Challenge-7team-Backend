use sc_barcode;

insert into bar_code(barcode_number, goods_name, how, method) values (8801094082406,'코카콜라 제로','뚜껑을 닫아서 배출한다', '본체 : 페트, 뚜껑 : 페트, 라벨 : 비닐'),
                                                                     (8801043015653,'육개장사발면(소)','깨끗히 씻어서 햇빛에 2-3일 말려 배출한다', '본체 : 스티로폼, 뚜껑 : 비닐'),
                                                                     (8801128503235,'김치왕뚜껑','깨끗히 씻어서 햇빛에 2-3일 말려 배출한다', '본체 : 플라스틱, 포장재 : 비닐'),
                                                                     (8801128503174,'팔도도시락','깨끗히 씻어서 햇빛에 2-3일 말려 배출한다', '본체 : 스티로폼, 뚜껑 : 비닐'),
                                                                     (4902430897389,'페브리즈','내부 가스 제거 후 상단의 노즐을 공구를 사용하여 분리 후 배출한다. 분리가 불가능하다면 상품 채로 일반쓰레기에 버린다', '본체 : 플라스틱, 라벨:  일반쓰레기, 노즐 : 쓰레기'),
                                                                     (8801104673211,'더단백','뚜껑 부분을 잘라서 쓰레기통으로 버린후 종이팩으로 배출한다', '본체 : 종이팩, 뚜껑 : 플라스틱'),
                                                                     (8801045450322,'허브솔트','내용물을 비우고 세척한 후 비닐로 배출한다', '본체 : 플라스틱, 뚜껑 : 플라스틱'),
                                                                     (8801043014809,'신라면','내용물을 비우고 세척한 후 비닐류로 배출한다. 스티커나 테이프가 붙여져 있는 경우, 떼어내서 쓰레기로 배출한다', '본체 : 비닐'),
                                                                     (8801043035989,'새우깡','내용물을 비우고 세척한 후 비닐류로 배출한다. 스티커나 테이프가 붙여져 있는 경우, 떼어내서 일반쓰레기로 버린다.', '본체 : 비닐'),
                                                                     (8801037019667,'믹스커피','커피믹스 비닐포장재는 내용물을 비우고 세척한 후 비닐류로 배출한다. 또한 개별포장 비닐이 흩날리지 않도록 봉투에 담아 배출한다', '본체 : 비닐, 포장재 : 종이'),
                                                                     (8801252029533,'지퍼백','지퍼백의 비닐 부분과 지퍼 부분이 같은 물질이므로, 지퍼백 상단의 밀폐 부분을 잘라내지 않고 통째로 비닐류로 배출하면 된다.', '본체 : 비닐, 포장재 : 종이'),
                                                                     (8801252015871,'가정용 랩','오염되어 있다면 일반 쓰레기로 배출하고, 닦아낼 수 있을 정도의 오염이면 충분히 씻어낸 후 비닐류로 배출 한다', '본품 : 비닐, 포장재 : 종이, 부속재: 톱날 + 철캔'),
                                                                     (8809004441039,'쌀포대','단면이 비닐코팅되어 있다면 종이류로, 양면이 비닐코팅 되어있다면 비닐류로 배출한다', '본체 : 종이'),
                                                                     (8886467105357,'프링글스','본체에서 밑면을 도려낸 후 배출한다', '본체 : 쓰레기, 밑면 : 알루미늄, 뚜껑 : 플라스틱'),
                                                                     (8801166022125,'각티슈','내용물(티슈)을 변기로 흘려보내면 안된다', '본체 : 종이팩, 포장지 : 비닐류, 빨대 : 쓰레기'),
                                                                     (8801069171067,'초코에몽팩','내용물을 비우고 세척한 후 비닐류로 배출한다. 스티커나 테이프가 붙여져 있는 경우, 떼어내서 쓰레기로 배출한다', '본체 : 종이팩, 포장지 : 비닐류, 빨대 : 쓰레기'),
                                                                     (8801121763933,'아몬드브리즈오리지널','내용물을 비우고 세척한 후 비닐류로 배출한다. 스티커나 테이프가 붙여져 있는 경우, 떼어내서 쓰레기로 배출한다', '본체 : 종이팩, 포장지 : 비닐류, 빨대 : 쓰레기'),
                                                                     (8801115114031,'서울우유','내용물을 비우고 세척한 후 해체하여 말린 뒤 배출한다. 종이류와 구분되지만 전용수거함이 따로 없으므로 종이류와 구분하여 배출한다. 혹은 종이팩 1kg이상 모아 동사무소 방문 하여 화장지로 교환이 가능하다', '본체 : 종이팩'),
                                                                     (8801094083007,'코카제로콜라캔250ml','내용물을 비우고 헹궈서 버린다 이때 캔 속에 이물질이 섞이지 않도록 한다. 눕혀서 옆면을 밟아 부피를 줄인다', '본체 : 캔'),
                                                                     (8801551102012,'부탄가스','본체에 구멍을 뚫어 내용물(가스)를 전부 비운 후 배출한다', '본체 : 캔'),
                                                                     (8801047123736,'참치캔','내용물을 비우고 세척한 후 배출한다. 캔류의 수거 장소가 종류에 따라 나뉘어져 있으면 캔류(알미늄)과 캔류(철) 로 분리 배출하고, 그렇지 않으면 다른 고철들과 함께 캔류로 분리 배출한다', '본체 : 철캔 ,뚜껑 : 알루미늄'),
                                                                     (8801133001030,'땅콩캔','캔류의 수거 장소가 종류에 따라 나뉘어져 있으면 캔류(알미늄)과 캔류(철) 로 분리 배출하고, 그렇지 않으면 다른 고철들과 함께 캔류로 분리 배출한다', '본체 : 알루미늄, 뚜껑 : 플라스틱'),
                                                                     (8808739000153,'볼펜','플라스틱 필기구는 고무 손잡이, 쇠 스프링 등 다른 재질이 혼합되어 있어 재활용 불가능하다', '본체 : 쓰레기, 포장재 : 비닐'),
                                                                     (8808739000108,'핫팩','핫팩 내부의 철가루는 한번 사용된 이상 재활용 불가능하다. 포장재로 사용되는 부직포는 합성섬유로 플라스틱과 같은 화학소재이고 재활용 불가능하다', '본체 : 쓰레기, 포장재 : 비닐'),
                                                                     (8808739000207,'칫솔','칫솔모, 고무 손잡이 등 다른 재질이 혼합되어 있어서 재활용 불가능하다', '본품 : 쓰레기, 포장재 : 비닐, 포장재 : 플라스틱'),
                                                                     (8808739000504,'고무장갑','고무 재질은 재활용 불가능하다', '본품 : 쓰레기, 포장재 : 비닐'),
                                                                     (8801260610211,'물티슈','사용한 물티슈는 쓰레기로 배출한다. 포장재는 캡을 비닐 포장재에서 떼어낸 후 재질별로 배출한다', '본품 : 쓰레기, 본체 : 비닐, 뚜껑 : 플라스틱'),
                                                                     (8801051152517,'샴푸','펌프가 달린 뚜껑 분해가 불가능하다면 통째로 일반 쓰레기로 배출한다. 가능하면 헤드, 몸통, 스프링, 튜브 각각 분리해서 스프링은 일반 쓰레기, 나머지는 플라스틱으로 배출한다', '본체: 플라스틱, 부속재 : 쓰레기'),
                                                                     (8801166131858,'마스크','모든 마스크는 일반 쓰레기로 배출한다', '본품 : 쓰레기, 포장재 : 비닐'),
                                                                     (8808739000108,'빨대','부피가 작아 재활용 불가능하다. 종이 빨대도 혼합 종이로 되어 있거나 음료 등의 이물질이 묻어있기 때문에 재활용 불가능하다.', '본체 : 쓰레기, 포장재 : 비닐'),
                                                                     (8801007860459,'햇반','용기에 쓰이는 재질은 내열성을 높이기 위해 여러 재질 혼합한 복합 플라스틱이기에 일반 플라스틱 재활용 과정보다 더 복잡한 과정을 거쳐야 하기때문에 재활용되지 않고 대부분 소각처리된다', '본체 : 쓰레기, 뚜껑 : 비닐'),
                                                                     (8808739000306,'라켓','여러 재질이 혼합되어 재활용 불가능 하다. 라켓용 가방은 의류수거함의 수거 품목에 해당되지 않으므로 쓰레기로 배출한다. 라켓 줄(거트)의 주원료는합성섬유이기 때문에 재활용 불가능 하다', '본품 : 쓰레기, 포장재 : 비닐');