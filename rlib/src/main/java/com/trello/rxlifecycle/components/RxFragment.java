�}'� 
 ��  jm��돦�u
��� x�O��M�O3�婫��.����&_b�-O����r
���g���}�9�挭!�K�dl��A��"h>��V�O>KpH�@%��;�@ũ�8�rȮħc���"\W;a����Kp;�2�젵��4�Y�BC��0��6Ly���`�8�O���<���L�0e���/��ϫ�i���0��3�x�ց���|�4������8�*����!�7�ĭp�˒ifl7��@L���j��-W�i	x:ȣ��EҒ��������6[���?�{ޮ����I��(��Ўج���&=�ZA��g�����w�z �͏�^�ra��{5���$o�A��H��q[���H'�>򀵎�WP=�vgAA�/9��]��ܵڋ���l�����Й�o�~��� ����w$Ow �3E4[G��vo�+ �n�R�4���m{�wK`���	b����h�ci��*<��e$�{�N7����Y?�l�(O��]��X~M��؊��I�l&|0֓�I�\Ƙs�R��� �Ɂ�L�j�o �V:�JH?<gg�%_��mh���.'vՔ �ϡ+��LO��$�����=J5�3E�'��������)s�.��#�id�����@=��Ep�6esmmc�n�@�����;�%+%��@԰���g�B�Rr�P�D.�����hk��ҳt�"����Y.�)�G t����#��|#՘����_��;��w}Rm���"`������W�1�.0u�:o�O�.}�`\-��l�\K�_�����q���0*8[�%s�����k��_|����-hBh6�OP8����	l���O�la�:Z8<�ez8CLɄE\����M�����xoI)iy��1M���a��s��$�]V�k�2�5�>j��!�_K ��to~��������,k�'lx�Ǆ��td��P���]~v8�ߩ��4rr:�K�����TgV��c�B�lD(�V52o���~U�t�*�&h�#@��,�d����<�2��gh9iV_����5fK�9���3 ��,��z
�h�⥯M����*V�c\-"�=R�O�P�3��f��:��l7�W%J��Ő2�3n�X��0@�L�[@(�-�a<�ݯd���^}�DܳzXC^!�2��Y(��sw7��q��hKkC��$x[�Md+��W�Ο���<�Q��j:[vV.Et0�M=���$^z,Cp�4㴿z�7�K�Ҟ+R�m@��xpXN�\�G�~�N�s�sNC���i �SM�r4=�2u�UL��{�/J�^�����zɁ��#����i�4-�i�m����Q�̛W.��Z�H'�F���]M�����ƌ(�/Q�x�6��e�����9�[��ؐ���g���Ht��`!f�#V�!���E��vb�ʉ��gL2��J���Qs@9fLA�J���K��{�ڲGx�����ϕ�>~�MP�#��})�)�lD(�V���2ou 	)N4�V�i�A =���� !��5�~t�ར�zapE�l�v�eOCO��R�X��0rɪ�UR~F[���"�����%�g�ĂJ4�幎.'�����?��Һ�-�;�L ~�做�o|�՟��/�Vr��ЭY���Zx�9�Sp�ݯ-C����^~���]LcV%�k��R��o%��Q��{Dcu�xq�SrL�P�ń���׾��F�s	3z`_n�V*���],[hJ]�,o�\����~P�.�
�>}`Y�X�Z�u�H�u�JK��g�^(�t. �S�=8Ү�JeC�t�J��Ն^�Ͻ����U�c�Hd�0������1g��QL�A����MC�����Q��i�H�,�`��1���ۃ�Tr��������g�]V�k�2�5�>j��!�_K ��to~��������,k�'lx�Ǆ��td��P���]~v8�ߩ��4rr:�K�����TgV��c�B�l"�z�"O����	���4�WxC�uqB��8�|@@�E�X���9}��aQg#UA�'�f'Y-��������pZ��t I�Kb�ÿ�?yb�	D��d¹�!稩�(9Q��y��8��>�+�1��0��V���$�-��ǫF��9 '���J�L2f�y�cl~"�@�/d�V��D�0J?��{� �[9tڜoкz\�/n���lπ,��'K�a����"1D~te\IO���{���D����a�q4|3SIP��[RV)��fG����Ӿ�Z�n�3j��'r������,�)C����C�Tt���GK�X�ij��,6?%/w��Qպ�BIu��?����(.��Ω|L�;�䉮0w�M�F�^�5w�IT�]v��K����<�5�;&�4'i7��52Nnѐ���*�ŕ���k� ���V�e��k)D�������Y��8h����Bծ2$'�<稌=Jڠ���I�*ݳ��W����per
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
