import { taskService } from '@/shared/api/task.service';
import { useMutation } from '@tanstack/react-query';
import { useNavigate } from 'react-router-dom';

export function useUpdateTask() {
	const navigate = useNavigate();
	return useMutation({
		mutationFn: (task_id: number) =>
			taskService.updateTask(task_id, { is_done: true }),
		mutationKey: ['task', 'update'],
		retry: 3,
		onSuccess: () => navigate('/tasks'),
		onError: () => console.log('error'),
	});
}
