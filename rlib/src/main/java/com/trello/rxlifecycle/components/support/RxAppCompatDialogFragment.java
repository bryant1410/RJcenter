�}� 
 ��  Ɉ99��9��u
��� x�O�>)&>3}����G�����5tX�&���}�MŤ�%��W�����ຟ����:�ͮ�*�[u�f�p�:2�@Ŵd0�Eb��ůC*IW*i�
PcC�;/��9�X�ԭƢ��S���8�ڐ(,�C�^V���)1X��,�-�q�ej
|?�З��8�6b���f��HG�,�Y����$%;��C�_�|�4������8�*����!�7�ĭp�˒ifl7��@L���j��-W�i	x:ȣ��EҒ��������6[���?�{ޮ����I��(��Ўج���&=�ZA��g�����w�z �͏�^�ra��{5���$o�A��H��q[���H'�>򀵎�WP=�vgAA�/9��]��ܵڋ���l�����Й�o�~��� ����w$Ow �3E4[G��vo�+ �n�R�4���m{�wK`���	b����h�ci��*<��e$�{�N7����Y?�l)�*�k����_z���^���Ũ㰿ܧ�}zQB TX�r 4����_-����J�(�,��B.g�x�R7G�;��amR��~g��� ���{�;����Dm�{��:�3��[��U�w�9䂳������TU����	��Ul�P_�U<�7�G�E��ˈ.�A��\��*����b�{��)g�n ��"�TU�_DD9+��|}�~J�M<�zt�Y'�l	�A�T��Yé�af��%޵�(<�w�(��<�w��r���Q��Y�^�`�O ��,�sc��O��p�9��X}���I<�i�胦E�L��34w�/۶,)�@rk�]�m�Z`���
GX�'�۸oa&s['��&@�b�)dS����A0�q~U�/��x�L���6�m<�}Hgs�'�di<B!�A=�;�����L�a4�q��=�[�e��x�0s�B�H�����5C�ݥ�DL�Tהۖ^B��2��؎U�����ekx8 gpQ���Sl�&5��ނ������3�ߎ�Kp��\ �����@�h��2���<aq �-#���r�>����e7%F��E�<��l%�l����'g4�R��Lp��\��&i��W1k[:��J�� ^*��ok̫�<AF�h��(D���(��ľ#����*Wz��@�V�Et�%�ī�1?V����1���ė{&��~������b�u��`Ѐ�u� ?�2^����H��@7�}�˘$4�7�K���r dk�cI!��q-Fr�+[2�����bM)���QJBP�;���p�%��$�*W���#��7%� i��Օݳ���,���a�
h����8q��[$��JR����e�:7fZ��)�` m�^9��*�U�M��I;Lz}iL9!������d�����ߩٝ��-�mJɢ��~��[�]����
{w�����U�k	|.^��(;m��CW�-Ryw��^	!�eL/�n������A婱9�a�X�f�N'r藍��U�l�(O��׉Xb�}��=�_]�Bi�P6��cu�v�/E �I��p�s��D�,�Xx� f� 	 {���� BE#�Т7��I/�.I~�E���>���۔�����G�u�:KM�N`��ȰF��$�TbD~FA��C\��{<J=o}��m���A���Ϋ%�6%���nԼ���`��ZqC�]�rs݌���hk���o�](߄��8�$�N-
׿��
��Wi!�Ƚ�.���y��5SN`î�lr��ځ��V�1�Af�8+Q�1�x8�4\a��y�W�T�����C4QB����3sMbyA�		y�����Z��Hm��ɚo;:`�P4�]䛏E)��ݱ
�8qN�#<\x/W�� 4HU 5��9݅��l>0�����,ciyϧ�R���a��s�b�D�QU�6l�>�l-�9C�|F-
�����Es;x����,
@<Q
J*°�H�}0A�������Ú�L�E��<����@�`����5]�lD!!��F�!x��,�=��`Ŷ��F�6��
��1�w�����5t�J��þj��w���X QD��L���*�O[g���Cl�w��Ѻ����A[[��P]$-���|��ƛf3?�!r����EU�����*D˚B�-��Q����{�t��gV �Pt>ا���M��.����Kcb~2���S��W"_߰1�{�9��qXH`��ݳ�l/�/%�������V<���j�?�$j�q,�K��M��;�7R�����(J���a?�'K��:����`��xulq��b�b��T���N���}8��tT�8�Q�5b�V��WF�\e]��� %���ˑ`u�|�GF��o�c�JI��@T�����_˝���X4����fN���W�H��hE�R�S��e"�9�-0.���0�8���)�O��F��p��YiJ> �-oF�$F�#g���Qҩ�]W~c*eq�D���gZI5���'L-Si�{���h~�h@|j`C>�.STOP);
        super.onStop();
    }

    @Override
    @CallSuper
    public void onDestroyView() {
        lifecycleSubject.onNext(FragmentEvent.DESTROY_VIEW);
        super.onDestroyView();
    }

    @Override
    @CallSuper
    public void onDestroy() {
        lifecycleSubject.onNext(FragmentEvent.DESTROY);
        super.onDestroy();
    }

    @Override
    @CallSuper
    public void onDetach() {
        lifecycleSubject.onNext(FragmentEvent.DETACH);
        super.onDetach();
    }
}
