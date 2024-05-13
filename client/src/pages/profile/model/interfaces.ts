import { IUserProfile } from '@/shared/interfaces/user.interfaces';

export interface IUserProfileBodyProps
	extends Pick<
		IUserProfile,
		'firstname' | 'lastname' | 'username' | 'profileImg' | 'qrCodeImg'
	> {}
